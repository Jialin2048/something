package com.rainforest.something.main.entrance.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.rainforest.something.R
import com.rainforest.something.databinding.ActivityMainBinding
import com.rainforest.something.main.entrance.login.LoginFragment
import com.rainforest.something.main.entrance.main.MainFragment

/**
 * 用FragmentContainerView来实例化承载主页面的fragment，便于实现全屏fragment
 */
class MainActivity : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        setContentView(binding.root)
        binding.viewModel = viewModel
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view, LoginFragment())
            .commit()
    }

    public fun activityViewModel(): MainActivityViewModel {
        return viewModel
    }
}