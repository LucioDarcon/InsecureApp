package com.example.example

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences(private var context: Context) {

    private val mSharedPreferences: SharedPreferences =
        context.getSharedPreferences("security_app", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String?) {
        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun storeInt(key: String, value: Int?) {
        value?.let { mSharedPreferences.edit().putInt(key, it).apply() }
    }

    fun getStoredString(key: String): String? {
        return mSharedPreferences.getString(key, "")
    }

    fun getStoredInt(key: String): Int? {
        return mSharedPreferences.getInt(key, 0)
    }

    fun clear() {
        mSharedPreferences.edit().clear().apply()
    }


}