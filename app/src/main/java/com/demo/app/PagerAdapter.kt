package com.demo.app

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PagerAdapter<Item : Any>(val list: List<Item>) : RecyclerView.Adapter<PagerAdapter.PagerViewHolder>() {

    class PagerViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun getItemCount(): Int = list.size

//    private val colors = arrayOf(Color.BLUE, Color.RED, Color.MAGENTA, Color.GREEN, Color.DKGRAY, Color.CYAN, Color.YELLOW)
    private val colors = arrayOf(Color.DKGRAY)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        return PagerViewHolder(TextView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            gravity = Gravity.CENTER_HORIZONTAL
            setTextColor(Color.WHITE)
        })
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        (holder.itemView as TextView).apply {
            @SuppressLint("SetTextI18n")
            text = "ViewPager => ${list[position]}[$position]"
            setBackgroundColor(colors[position % colors.size])
        }
    }
}