package Profile

import Authentication.LoginFragment
import Repository.ProfileRepository
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.poc.R
import com.example.poc.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding
    lateinit var viewModel: ProfileViewModel
    lateinit var uri:String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        var appCompatActivity: AppCompatActivity = (activity as AppCompatActivity)
        appCompatActivity.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        appCompatActivity.supportActionBar?.title = "Profile"

        viewModel.getProfileData()

        viewModel.uri.observe(viewLifecycleOwner, Observer {
            uri = it
            Glide.with(context!!)
                .load(it)
                .fitCenter()
                .placeholder(R.drawable.ic_baseline_person_pin_24)
                .into(binding.profileProfilePic)
        })

        binding.tvGoToEditProfile.setOnClickListener(View.OnClickListener {
            fragmentChange(EditProfileFragment())
        })

        binding.profileProfilePic.setOnClickListener(View.OnClickListener {
            val bundle = Bundle()
            bundle.putString("image_uri",uri)
            var fragment:Fragment = ProfilePictureFragment()
            fragment.arguments = bundle
            fragmentChange(fragment)
        })

        viewModel.msg.observe(viewLifecycleOwner, Observer {
            if(it.equals("ok"))
                binding.progressBarProfile.visibility = View.INVISIBLE

        })

        return binding.root
    }

    private fun fragmentChange(fragment: Fragment)
    {
        var transaction:FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment_content_side_menu,fragment).commit()
    }


}