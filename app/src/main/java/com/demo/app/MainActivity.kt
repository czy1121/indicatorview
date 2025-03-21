package com.demo.app

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.demo.app.databinding.ActivityMainBinding
import me.reezy.cosmo.indicatorview.ColorIndicatorView
import me.reezy.cosmo.indicatorview.IndicatorView
import me.reezy.cosmo.indicatorview.ScaleIndicatorView
import me.reezy.cosmo.indicatorview.setIndicator

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by lazy { ActivityMainBinding.bind((findViewById<ViewGroup>(android.R.id.content)).getChildAt(0)) }


    private val list = listOf("One", "Two", "Three", "Four", "Five", "Six")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.pager.adapter = PagerAdapter(list)
        binding.pager.setIndicator(binding.indicator.setWormMode().setSize(10.dp, activeWidth = 30.dp).setCornerRadius(5.dp))

        binding.banner.setIndicator(IndicatorView(this))
        binding.banner.setAdapter(BannerAdapter("Default")).start()
        binding.banner.setData(list)

        binding.banner1.setIndicator(
            IndicatorView(this).setWormMode()
                .setSize(10.dp, activeWidth = 30.dp)
                .setColor(getColor(R.color.teal_200), getColor(R.color.purple_200))
                .setGap(10.dp)
                .setCornerRadius(5.dp)
        )
        binding.banner1.setAdapter(BannerAdapter("WormMode")).start()
        binding.banner1.setData(list)

        binding.banner2.setIndicator(
            IndicatorView(this).setSlideMode()
                .setSize(10.dp)
                .setCornerRadius(2.dp)
                .setStroke(2.dp)
        )
        binding.banner2.setAdapter(BannerAdapter("SlideMode")).start()
        binding.banner2.setData(list)

        binding.banner3.setIndicator(
            IndicatorView(this).setWormMode().setRoundLine()
                .setSize(10.dp, activeWidth = 30.dp)
                .setCornerRadius(5.dp)
        )
        binding.banner3.setAdapter(BannerAdapter("RoundLine")).start()
        binding.banner3.setData(list)

        binding.banner4.setIndicator(
            ColorIndicatorView(this)
                .setColor(getColor(R.color.teal_200), getColor(R.color.purple_200))
                .setSize(20.dp)
                .setCornerRadius(5.dp)
        )
        binding.banner4.setAdapter(BannerAdapter("Color")).start()
        binding.banner4.setData(list)

        binding.banner5.setIndicator(ScaleIndicatorView(this).setSize(10.dp, activeWidth = 30.dp).setCornerRadius(2.dp))
        binding.banner5.setAdapter(BannerAdapter("RectScale")).start()
        binding.banner5.setData(list)

        binding.banner6.setIndicator(ScaleIndicatorView(this).setOvalShape().setSize(10.dp, activeSize = 20.dp))
        binding.banner6.setAdapter(BannerAdapter("OvalScale")).start()
        binding.banner6.setData(list)
    }

    private val Int.dp: Int get() = (this * resources.displayMetrics.density).toInt()
}