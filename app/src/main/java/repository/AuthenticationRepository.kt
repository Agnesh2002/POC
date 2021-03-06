package repository

import main.SideMenuActivity
import models.UserData
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.MutableLiveData
import androidx.room.Room
import authentication.AuthenticationActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import models.database.Database
import models.database.LoginData

@OptIn(DelicateCoroutinesApi::class)
class AuthenticationRepository {

    private lateinit var auth: FirebaseAuth
    private var firebaseUser: FirebaseUser?=null
    private var firestore: FirebaseFirestore = FirebaseFirestore.getInstance()

    var loginStatus: MutableLiveData<Boolean> = MutableLiveData()
    var liveRepoMessage: MutableLiveData<String> = MutableLiveData()

    init {
        GlobalScope.launch(Dispatchers.Default) {
            auth = FirebaseAuth.getInstance()
            //firebaseUser = auth.currentUser
        }
    }

    fun registerUser(username: String, email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    setProfile(email,username)
                } else {
                    liveRepoMessage.postValue(it.exception?.message)
                    return@addOnCompleteListener
                }
            }
            .addOnFailureListener {
                liveRepoMessage.postValue(it.message)
                return@addOnFailureListener
            }
    }

    private fun setProfile(email: String, username: String) {
        val userData = UserData(username, "", "", "","")

        firestore.collection("USERS").document(email)
            .set(userData)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    liveRepoMessage.postValue("User has been registered successfully")
                } else {
                    liveRepoMessage.postValue(it.exception?.message)
                    return@addOnCompleteListener
                }
            }
            .addOnFailureListener {
                liveRepoMessage.postValue(it.message)
                return@addOnFailureListener
            }
    }

    private fun isVerified(): Boolean
    {
        firebaseUser = auth.currentUser
        if(!firebaseUser!!.isEmailVerified)
        {
            firebaseUser!!.sendEmailVerification()
            return false
        }
        else
            return true
    }

    fun loginUser(application: Application, email: String, password: String, save: Boolean) {

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful) {

                    if(!isVerified())
                    {
                        Toast.makeText(application,"Please check your email for a verification link. After verification try logging in again",Toast.LENGTH_LONG).show()
                        return@addOnCompleteListener
                    }
                    if(save)
                    {
                        GlobalScope.launch(Dispatchers.Default) {
                            val db = Room.databaseBuilder(application.applicationContext,Database::class.java,"userdb").build()
                            val loginDataObj = LoginData(1,true)
                            db.accessDao().putData(loginDataObj)
                        }
                    }

                    val i = Intent(application.applicationContext, SideMenuActivity::class.java)
                    i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(application.applicationContext, i, Bundle())
                    loginStatus.value = true

                } else {
                    liveRepoMessage.postValue(it.exception?.message)
                    loginStatus.value = false
                    return@addOnCompleteListener
                }
            }
            .addOnFailureListener {
                liveRepoMessage.postValue(it.message)
                loginStatus.value = false
                return@addOnFailureListener
            }
    }

    fun resetPassword(email: String) {
        auth.sendPasswordResetEmail(email)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    liveRepoMessage.postValue("Password reset link has been sent to the provided email address")
                } else {
                    liveRepoMessage.postValue(it.exception?.message)
                    return@addOnCompleteListener
                }
            }
            .addOnFailureListener {
                liveRepoMessage.postValue(it.message)
                return@addOnFailureListener
            }
    }

    fun logoutUser(application: Application) {
        auth.signOut()
        GlobalScope.launch {
            val db = Room.databaseBuilder(application.applicationContext,Database::class.java,"userdb").build()
            db.accessDao().deleteData()
        }
        val i = Intent(application.applicationContext, AuthenticationActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        i.putExtra("STATUS",false)
        startActivity(application.applicationContext, i, Bundle())

    }

}