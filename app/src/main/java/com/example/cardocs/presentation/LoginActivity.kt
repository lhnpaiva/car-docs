package com.example.cardocs.presentation

import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.cardocs.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val viewPager2 = findViewById<ViewPager2>(R.id.registerViewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val buttonNextPage = findViewById<Button>(R.id.button)

        val fragmentList = arrayListOf(RegisterFirstPageFragment.newInstance(), RegisterSecondPageFragment.newInstance(), RegisterThirdPageFragment.newInstance())

        configAdapterAndTabLayout(viewPager2, fragmentList, tabLayout)

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        configNextPageButton(buttonNextPage, viewPager2)
    }

    private fun configNextPageButton(buttonNextPage: Button, viewPager2: ViewPager2) {
        buttonNextPage.setOnClickListener {
            viewPager2.setCurrentItem(getItem(+1, viewPager2), true)
        }
    }

    private fun getItem(i: Int, viewPager2: ViewPager2): Int {
        return viewPager2.currentItem + i
    }

    private fun configAdapterAndTabLayout(viewPager2: ViewPager2, fragmentList: ArrayList<Fragment>, tabLayout: TabLayout) {
        viewPager2.adapter = ViewPagerAdapter(this@LoginActivity, fragmentList)
        TabLayoutMediator(tabLayout, viewPager2) { tab, position -> }.attach()
    }
}