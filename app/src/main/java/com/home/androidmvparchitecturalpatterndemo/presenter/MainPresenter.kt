package com.home.androidmvparchitecturalpatterndemo.presenter

import com.home.androidmvparchitecturalpatterndemo.model.MainBean
import com.home.androidmvparchitecturalpatterndemo.model.MainModel

class MainPresenter(private val onMainViewListener: OnMainViewListener) {

    interface OnMainViewListener {
        fun onSayHello(message: String)
    }

    private val mainModel: MainModel = MainModel()

    fun getMainData(onGetMainDataListener: MainModel.OnGetMainDataListener) {
        mainModel.getMainData(object : MainModel.OnGetMainDataListener {
            override fun onSuccess(mainData: MainBean) {
                onGetMainDataListener.onSuccess(mainData)
                val sayHello = "Hello"
                onMainViewListener.onSayHello(sayHello)
            }
        })
    }
}