package com.example.promptly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var homeFragment: HomeFragment
    lateinit var coursesFragment: CoursesFragment
    lateinit var addHWFragment: addHWFragment
    lateinit var searchFragment: SearchFragment
    lateinit var profileFragment: ProfileFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //home fragment is the default screen
        //the following lines of code sets the home fragment onto the screen
        homeFragment = HomeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
        //bottom navigation bar
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_nav)

        bottomNavigation.setOnNavigationItemSelectedListener {item ->
            // on select listeners for each item on the navigation bar
            // the following fragments will be shown
            when(item.itemId){
                // the code for setting the new fragment on to the screen
                R.id.home -> {//home
                    homeFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.courses -> {//courses
                    coursesFragment = CoursesFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, coursesFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.new_hw -> {//add new homework
                    addHWFragment = addHWFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, addHWFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.search -> { // search
                    searchFragment = SearchFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, searchFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.profile -> {//profile
                    profileFragment = ProfileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

            }
           true
        }
    }
}
