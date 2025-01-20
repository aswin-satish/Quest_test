package com.example.casestudy1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_nav_bar)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)


        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, RecyclerViewMain())
                        .commit()
                }

                else -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, ViewPagerMain())
                        .commit()
                }

            }
            true
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RecyclerViewMain())
            .commit()

    }
}


//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.bottom_nav_bar)
//
//        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//
//
//        bottomNavigation.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.item1 -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fragment_container, RecyclerViewMain())
//                        .commit()
//                }
//
//                else -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fragment_container, ViewPagerMain())
//                        .commit()
//                }
//
//            }
//            true
//        }
//
//        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, RecyclerViewMain())
//            .commit()
//
//    }