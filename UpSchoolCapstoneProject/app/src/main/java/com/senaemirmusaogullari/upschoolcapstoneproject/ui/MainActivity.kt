package com.senaemirmusaogullari.upschoolcapstoneproject.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.senaemirmusaogullari.upschoolcapstoneproject.R
import com.senaemirmusaogullari.upschoolcapstoneproject.common.gone
import com.senaemirmusaogullari.upschoolcapstoneproject.common.viewBinding
import com.senaemirmusaogullari.upschoolcapstoneproject.common.visible
import com.senaemirmusaogullari.upschoolcapstoneproject.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNav, navController)

        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.signInFragment,
                R.id.signUpFragment,
                R.id.splashFragment,
                R.id.successFragment2 -> {

                    binding.bottomNav.gone()
                }

                else -> {
                    binding.bottomNav.visible()
                }
            }
        }
    }
}



