package com.jeff_skillrill.bookstore

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.jeff_skillrill.bookstore.adapter.OnBoardingViewPagerAdapter
import com.jeff_skillrill.bookstore.model.OnBoardingData

class MainActivity : AppCompatActivity() {

    var onBoardingViewPagerAdapter : OnBoardingViewPagerAdapter? = null
    var tabLayout: TabLayout? = null
    var onBoardingViewPager: ViewPager? = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab_indicator)

        val onBoardingData:MutableList<OnBoardingData> = ArrayList()
        onBoardingData.add(OnBoardingData("","", R.drawable.logo))
        onBoardingData.add(OnBoardingData("Read your e-books",
            "Contrary You can buy any books online. we will deliver the book within 2 days in tashkent 3 days within Uzbekistan",
            R.drawable.image_splash_screen1))
        onBoardingData.add(OnBoardingData("Order your books",
            "Contrary You can buy any books online. we will deliver the book within 2 days in tashkent 3 days within Uzbekistan",
            R.drawable.image_splash_screen2))
        setOnBoardingViewPagerAdapter(onBoardingData)

    }

    private fun setOnBoardingViewPagerAdapter(onBoardingData: List<OnBoardingData>)
    {
        onBoardingViewPager = findViewById(R.id.screenPager);
        onBoardingViewPagerAdapter = OnBoardingViewPagerAdapter(this, onBoardingData)
        onBoardingViewPager!!.adapter = onBoardingViewPagerAdapter
        tabLayout?.setupWithViewPager(onBoardingViewPager)
    }
}