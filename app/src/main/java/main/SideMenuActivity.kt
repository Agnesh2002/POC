package main

import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import ble.AlertWindow
import ble.BLE
import com.example.poc.R
import com.example.poc.databinding.ActivitySideMenuBinding
import com.example.poc.databinding.NavHeaderSideMenuBinding
import com.google.android.material.navigation.NavigationView
import com.orhanobut.logger.Logger
import models.Common
import models.Common.toast

class SideMenuActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySideMenuBinding
    private lateinit var viewModel: DashboardViewModel
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySideMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.appBarSideMenu.toolbar)
        Common.setUpLogger()
        Logger.d("Logger setup successful")

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        navController = findNavController(this, R.id.nav_host_fragment_content_side_menu)

        val viewHeader = binding.navView.getHeaderView(0)
        val navViewHeaderBinding: NavHeaderSideMenuBinding =
            NavHeaderSideMenuBinding.bind(viewHeader)

        appBarConfiguration =
            AppBarConfiguration(setOf(R.id.nav_dashboard, R.id.nav_profile, R.id.nav_weather, R.id.nav_live_stream, R.id.nav_ble, R.id.nav_device), drawerLayout)
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)

        viewModel = ViewModelProvider(this)[(DashboardViewModel::class.java)]
        viewModel.getUsernameAndEmail()
        viewModel.uname.observeForever {
            toast(applicationContext, "Hi, ${it}.")
            navViewHeaderBinding.tvHeaderUname.text = it
        }
        viewModel.email.observeForever {
            navViewHeaderBinding.tvHeaderEmail.text = it
        }

        val manager: PackageManager = application.packageManager
        val info: PackageInfo = manager.getPackageInfo(applicationContext.packageName, 0)
        val version: MenuItem = navView.menu.findItem(R.id.nav_version)
        version.title = "Version : ${info.versionName}"

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_dashboard -> {
                    navController.popBackStack()
                    navController.navigate(R.id.nav_dashboard); drawerLayout.closeDrawer(GravityCompat.START); true
                }
                R.id.nav_profile -> {
                    navController.popBackStack()
                    navController.navigate(R.id.nav_profile); drawerLayout.closeDrawer(GravityCompat.START); true
                }
                R.id.nav_weather -> {
                    navController.popBackStack()
                    navController.navigate(R.id.nav_weather); drawerLayout.closeDrawer(GravityCompat.START); true
                }
                R.id.nav_live_stream -> {
                    navController.popBackStack()
                    navController.navigate(R.id.nav_live_stream); drawerLayout.closeDrawer(GravityCompat.START); true
                }
                R.id.nav_ble -> {
                    navController.popBackStack()
                    navController.navigate(R.id.nav_ble); drawerLayout.closeDrawer(GravityCompat.START); true
                }
                R.id.nav_logout -> {
                    performLogout(); true
                }
                else -> false
            }
        }

        BLE.connectionStatus.observeForever {
            when(it)
            {
                0->{
                    AlertWindow.buildWindow(this, "Connecting...","Please wait till the connection is active", R.drawable.ic_baseline_bluetooth_searching_24)
                    AlertWindow.showWindow()
                }
                1->{
                    AlertWindow.dismissWindow()
                    AlertWindow.buildWindow(this, "Connection Failed","Please try again", android.R.drawable.ic_dialog_alert)
                    AlertWindow.builder
                        .setNegativeButton("Exit") { dialogInterface, _ ->
                            dialogInterface.dismiss()
                        }

                    AlertWindow.showWindow()
                }
                2->{
                    AlertWindow.dismissWindow()
                    toast(this, "Connected to the device successfully")
                    navController.popBackStack()
                    navController.navigate(R.id.nav_device)
                }
                3->{
                    AlertWindow.buildWindow(this, "Connection Lost","Please try reconnecting",R.drawable.ic_baseline_bluetooth_disabled_24)
                    AlertWindow.builder
                        .setPositiveButton("Reconnect") { _, _ ->
                            AlertWindow.dismissWindow()
                            BLE.connect(BLE.selectedDevice.value!!)
                        }
                        .setNegativeButton("Exit") { dialogInterface, _ ->
                            dialogInterface.dismiss()
                            navController.popBackStack()
                            navController.navigate(R.id.nav_ble); drawerLayout.closeDrawer(GravityCompat.START)
                        }

                    AlertWindow.showWindow()
                }
                4->{
                    toast(applicationContext, "Device disconnected successfully. (Please turn of your bluetooth and GPS)")
                    navController.popBackStack()
                    navController.navigate(R.id.nav_ble); drawerLayout.closeDrawer(GravityCompat.START)
                }
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.side_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.action_logout -> {
                performLogout(); return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(this, R.id.nav_host_fragment_content_side_menu)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    private fun performLogout() {

        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setTitle("Logout")
        builder.setMessage("Are you sure you want to logout ? ")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        builder.setPositiveButton("Yes") { _, _ ->
            this.finish()
            viewModel.performLogout()
        }

        builder.setNegativeButton("Cancel") { dialogInterface, _ ->
            dialogInterface.dismiss()
        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()

    }


}