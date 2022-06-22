package com.rainforest.something.main.entrance.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rainforest.something.R
import com.rainforest.something.databinding.FragmentLoginBinding
import com.rainforest.something.main.entrance.activity.MainActivity

/**
 * Author: RaIN
 * Date: 2022/6/12
 * Path: com.rainforest.something.main.entrance.login
 * Desc: 登录页面
 */

class LoginFragment: Fragment() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(layoutInflater,R.layout.fragment_login, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = requireActivity()
        (activity as MainActivity).activityViewModel().showFragment()
        return binding.root
    }
}