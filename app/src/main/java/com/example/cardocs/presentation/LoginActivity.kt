package com.example.cardocs.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.cardocs.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val viewPager2 = findViewById<ViewPager2>(R.id.registerViewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val fragmentList = arrayListOf(RegisterFirstPageFragment.newInstance(), RegisterSecondPageFragment.newInstance(), RegisterThirdPageFragment.newInstance())

        viewPager2.adapter = ViewPagerAdapter(this@LoginActivity, fragmentList)

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            //Some implementation
        }.attach()
    }
}