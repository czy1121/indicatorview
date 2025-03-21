package com.demo.app

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import me.reezy.cosmo.bannerview.BannerView

class BannerAdapter(private val title: String) : BannerView.Adapter<String>() {

//    private val colors = arrayOf(Color.BLUE, Color.RED, Color.MAGENTA, Color.GREEN, Color.DKGRAY, Color.CYAN, Color.YELLOW)
    private val colors = arrayOf(Color.DKGRAY)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerView.ViewHolder {
        return BannerView.ViewHolder(TextView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            gravity = Gravity.CENTER_HORIZONTAL
            setTextColor(Color.WHITE)
        })
    }

    override fun onBindViewHolder(holder: BannerView.ViewHolder, position: Int) {
        val origin = getOriginPosition(position)
        (holder.itemView as TextView).apply {
            @SuppressLint("SetTextI18n")
            text = "$title => ${getItem(position)}[$origin]"
            setBackgroundColor(colors[origin % colors.size])
        }
    }
}