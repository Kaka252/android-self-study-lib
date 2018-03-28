package com.zhouyou.android.lib.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zhouyou.android.lib.R
import kotlinx.android.synthetic.main.activity_country_list.*

class CountryListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_list)



    }

    fun getData() : List<LevelBean> {
        val list : List<LevelBean> = ArrayList()
        for (i : Int in 0..10) {
//            var item = LevelBean(i, "")
//            list. = item
        }



        return list
    }

    fun refreshAdapter(list : List<LevelBean>) {
        val adapter = CountryListAdapter(this, list)
        rv_list.adapter = adapter
    }
}
