package com.home.androidmvparchitecturalpatterndemo.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.home.androidmvparchitecturalpatterndemo.model.MainBean
import com.home.androidmvparchitecturalpatterndemo.model.MainModel
import com.home.androidmvparchitecturalpatterndemo.presenter.MainPresenter
import com.home.androidmvparchitecturalpatterndemo.view.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPresenter.OnMainViewListener {

    private val mainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.home.androidmvparchitecturalpatterndemo.R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // 設置狀態欄文字顏色及圖標為深色
        mainPresenter.getMainData(object :MainModel.OnGetMainDataListener{
            override fun onSuccess(mainData: MainBean) {
                initializeRecyclerView(mainData)
            }
        })
    }

    private fun initializeRecyclerView(mainData: MainBean) {
        val adapter = MainAdapter()
        adapter.setPostList(mainData.postList)
        recycler_view.adapter = adapter
        val cacheSize = -1
        recycler_view.setItemViewCacheSize(cacheSize) // 解決複用錯亂的問題
    }

    @SuppressLint("ShowToast")
    override fun onSayHello(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}