package com.dhanusrisapplication.app.modules.androidlargetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityAndroidLargeTwoBinding
import com.dhanusrisapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.dhanusrisapplication.app.modules.androidlargetwo.`data`.viewmodel.AndroidLargeTwoVM
import com.dhanusrisapplication.app.modules.iphone14one.ui.Iphone14OneActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeTwoActivity :
    BaseActivity<ActivityAndroidLargeTwoBinding>(R.layout.activity_android_large_two) {
  private val viewModel: AndroidLargeTwoVM by viewModels<AndroidLargeTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcons8peoplew.setOnClickListener {
      val destIntent = Iphone14OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8homepag.setOnClickListener {
      val destIntent = AndroidLargeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
