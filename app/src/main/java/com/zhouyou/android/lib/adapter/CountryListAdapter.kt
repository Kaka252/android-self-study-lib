package com.zhouyou.android.lib.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Author: ZhouYou
 * Date: 2018/3/28.
 */
class CountryListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var  list : List<Object>? = null

    constructor(list : List<Object>) : super() {
        this.list = list
    }
}