package com.android.teavscoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.android.teavscoffee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        drawerLayout = dataBinding.drawerLayout
    }

    override fun onStart() {
        super.onStart()
        navController = findNavController(R.id.nav_host_fragment_container)
        NavigationUI.setupActionBarWithNavController(this@MainActivity, navController, drawerLayout)
        NavigationUI.setupWithNavController(dataBinding.navigationView, navController)
        NavigationUI.setupWithNavController(dataBinding.bottomNav, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        navController = findNavController(R.id.nav_host_fragment_container)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}
