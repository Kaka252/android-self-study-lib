package com.zhouyou.android.lib.recyclerview

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.zhouyou.android.lib.R

/**
 * Author: ZhouYou
 * Date: 2018/3/28.
 */
class CountryListAdapter : RecyclerView.Adapter<CountryItemViewHolder> {

    private var activity: Activity? = null
    private var list: List<LevelBean>? = null

    constructor(activity: Activity, list: List<LevelBean>) : super() {
        this.activity = activity
        this.list = list
    }

    override fun onBindViewHolder(holder: CountryItemViewHolder, position: Int) {
        val bean = getItem(position)
        if (bean != null) {
            holder.tvCountry.text = bean.name
            holder.tvCountryCode.text = "+" + bean.code
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryItemViewHolder {
        val view = LayoutInflater.from(activity).inflate(R.layout.item_country, parent, false)
        return CountryItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list?.size!!
    }

    private fun getItem(position: Int): LevelBean? {
        return list?.get(position)
    }


}