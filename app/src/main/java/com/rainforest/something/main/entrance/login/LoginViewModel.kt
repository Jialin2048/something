package com.rainforest.something.main.entrance.login

import android.app.Application
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.rainforest.something.main.entrance.login.model.LoginBean

/**
 * Author: RaIN
 * Date: 2022/6/13
 * Path: com.rainforest.something.main.entrance.login
 * Desc:
 */


class LoginViewModel(application: Application):AndroidViewModel(application) {
    val TAG: String = "hello"
    public var loginUserLiveData = MutableLiveData(LoginBean(account = "", pwd = ""))
    public var accountLiveData = MutableLiveData<String>()
    public var pwdLiveData = MutableLiveData<String>()
    public fun loginClick() {

        Toast.makeText(getApplication(), "${accountLiveData.value} ${pwdLiveData.value}", Toast.LENGTH_SHORT).show()
    }
}