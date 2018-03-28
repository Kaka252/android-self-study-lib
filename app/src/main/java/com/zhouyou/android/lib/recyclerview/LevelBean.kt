package com.zhouyou.android.lib.recyclerview

import java.io.Serializable

/**
 * Author: ZhouYou
 * Date: 2018/3/28.
 */
class LevelBean : Serializable {

    var code: Long = 0
    var name: String = ""

    constructor(code: Long, name: String) {
        this.code = code
        this.name = name
    }
}