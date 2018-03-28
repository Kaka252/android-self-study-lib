package com.zhouyou.android.lib.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.zhouyou.android.lib.R
import kotlinx.android.synthetic.main.activity_country_list.*

class CountryListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_list)

        val list = getData()
        refreshAdapter(list as ArrayList<LevelBean>)
    }

    private fun getData() : List<LevelBean> {
        val list : ArrayList<LevelBean> = ArrayList()
        (0..10).mapTo(list) { LevelBean(it.toLong(), "城市") }
        return list
    }

    private fun refreshAdapter(list : ArrayList<LevelBean>) {

        val manager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_list.layoutManager = manager
        val adapter = CountryListAdapter(this, list)
        rv_list.adapter = adapter
    }
}
