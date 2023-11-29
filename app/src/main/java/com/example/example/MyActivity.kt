package com.example.example

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.example.databinding.MainActivityBinding


class MyActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private var mBinding: MainActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)

        setSpinnerAdapter()

        mBinding?.executePendingBindings()
    }

    private fun setSpinnerAdapter() {
        val items = arrayOf("SQLITE", "ROOM", "SHARED_PREF")
        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            items
        )
        mBinding?.spinner?.adapter = adapter
        mBinding?.spinner?.onItemSelectedListener = this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

}