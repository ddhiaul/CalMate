package com.aulia.idn.calmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.aulia.idn.calmate.Aritmatic.AritmaticFragment
import com.aulia.idn.calmate.BangunDatar.BgnDatarFragment
import com.aulia.idn.calmate.BangunRuang.BgnRuangFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_bangun_datar -> {
                val fragment = BgnDatarFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_bangun_ruang -> {
                val fragment = BgnRuangFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_aritmatic -> {
                val fragment = AritmaticFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fm, fragment, fragment::class.java.simpleName)
            .addToBackStack(null).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_main.setOnNavigationItemSelectedListener (onNavigationItemSelectedListener)
        val mainFragment = BgnDatarFragment.newInstance()
        addFragment(mainFragment)
    }
}
