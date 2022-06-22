package com.rainforest.something.main.application

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Author: RaIN
 * Date: 2022/6/12
 * Path: com.rainforest.something.main.application
 * Desc:
 */

class STApplication: Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var instance: Context
        fun getContext() {
            instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}