package profile

import repository.ProfileRepository
import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import models.Common.toast

class ProfileViewModel(application: Application) : AndroidViewModel(application) {

    private var profileRepository: ProfileRepository = ProfileRepository()
    var fullName: MutableLiveData<String> = MutableLiveData()
    var dob: MutableLiveData<String> = MutableLiveData()
    var email: MutableLiveData<String> = MutableLiveData()
    var phone: MutableLiveData<String> = MutableLiveData()
    var username: MutableLiveData<String> = MutableLiveData()
    var uri: MutableLiveData<String> = MutableLiveData()
    var msg: MutableLiveData<String> = MutableLiveData()


    private fun startObservation() {
        profileRepository.liveUserData.observeForever {
            msg.postValue(it.message)
            if (it.message != "ok") {
                toast(getApplication(), it.message.toString())
            }
        }
    }

    fun getProfileData() {

        profileRepository.getData()
        profileRepository.liveUserData.observeForever {
            this.username.postValue(it.username)
            this.fullName.postValue(it.fullname)
            this.dob.postValue(it.dob)
            this.email.postValue(it.email)
            this.phone.postValue(it.phone)
            this.uri.postValue(it.image_uri)
        }

        startObservation()

    }

    fun updateProfileData() {

        profileRepository.updateData(
            username.value.toString(),
            fullName.value.toString(),
            dob.value.toString(),
            phone.value.toString()
        )
        startObservation()
    }


    fun uploadProfilePicture(uri: Uri) {
        msg.postValue("in progress")
        viewModelScope.launch{
            profileRepository.updateProfilePicture(uri)
        }
        startObservation()
    }



}