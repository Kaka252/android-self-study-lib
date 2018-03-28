package com.zhouyou.android.lib.recyclerview

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.zhouyou.android.lib.R
import kotlinx.android.synthetic.main.activity_country_list.*
import java.io.Serializable

class CountryListActivity : AppCompatActivity() {

    private val DATA_ENTITY = "COUNTRY_DATA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_list)

        val t = Thread(runnable)
        t.start()
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

    private val runnable = Runnable {
        val countryList = getData()
        val data = Bundle()
        data.putSerializable(DATA_ENTITY, countryList as Serializable)
        val message = Message.obtain()
        message.data = data
        handlerCall.sendMessage(message)
    }

    private val handlerCall = Handler(Handler.Callback { msg ->
        val data = msg.data
        if (data != null) {
            val countryList = data.getSerializable(DATA_ENTITY) as ArrayList<LevelBean>
            refreshAdapter(countryList)
        }
        true
    })
}
