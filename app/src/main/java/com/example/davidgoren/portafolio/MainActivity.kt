package com.example.davidgoren.portafolio

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.davidgoren.portafolio.controller.DevPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = DevPagerAdapter(supportFragmentManager)
        tabLayoutId.setupWithViewPager(viewPager)
        tabLayoutId.setTabTextColors(Color.GRAY, Color.parseColor("white"))
    }
}
