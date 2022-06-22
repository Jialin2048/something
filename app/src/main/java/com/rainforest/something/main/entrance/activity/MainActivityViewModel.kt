package com.rainforest.something.main.entrance.activity

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.rainforest.something.main.entrance.login.LoginFragment
import com.rainforest.something.main.entrance.main.MainFragment

/**
 * Author: RaIN
 * Date: 2022/6/12
 * Path: com.rainforest.something.main.activity
 * Desc: 主activity viewmodel
 */

class MainActivityViewModel: ViewModel() {
    private val isLoginState = false
    public val destination = "com.rainforest.something.main.entrance.main.MainFragment"

    public fun showFragment(): String {
        return if (isLoginState) {
            "com.rainforest.something.main.entrance.main.MainFragment"
        } else {
            "com.rainforest.something.main.entrance.login.LoginFragment"
        }
    }
}