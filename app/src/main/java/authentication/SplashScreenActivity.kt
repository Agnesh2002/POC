package authentication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.poc.R
import com.example.poc.databinding.FragmentSplashBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import models.Common

class SplashScreenActivity : AppCompatActivity() {

    lateinit var binding: FragmentSplashBinding
    lateinit var viewModel: AuthenticationViewModel
    private var status: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(!Common.isOnline(applicationContext))
            Toast.makeText(applicationContext,"Network connectivity not available",Toast.LENGTH_LONG).show()

        viewModel = ViewModelProvider(this)[AuthenticationViewModel::class.java]
        viewModel.checkForLogin()

        viewModel.dbData.observe(this) {
            status = it
        }

        lifecycleScope.launch(Dispatchers.Default) {
            val sUri = "android.resource://" + packageName + "/" + R.raw.poc
            val uri = Uri.parse(sUri)
            binding.videoView.setVideoURI(uri)
            binding.videoView.requestFocus()
            binding.videoView.start()
        }

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(applicationContext, AuthenticationActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK + Intent.FLAG_ACTIVITY_NO_ANIMATION
            i.putExtra("STATUS",status)
            ContextCompat.startActivity(applicationContext, i, Bundle())
            this.finish()
        },3000)

    }

}