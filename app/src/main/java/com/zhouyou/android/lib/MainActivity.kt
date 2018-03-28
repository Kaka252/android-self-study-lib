package com.zhouyou.android.lib

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zhouyou.android.lib.adapter.CountryListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = CountryListAdapter()
        rv_list.adapter = adapter
    }
}
