package com.zhouyou.android.lib.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.zhouyou.android.lib.R

/**
 * Author: ZhouYou
 * Date: 2018/3/28.
 */
class CountryItemViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    var tvCountry = itemView!!.findViewById<TextView>(R.id.tv_country)
    var tvCountryCode = itemView!!.findViewById<TextView>(R.id.tv_country_code)
}