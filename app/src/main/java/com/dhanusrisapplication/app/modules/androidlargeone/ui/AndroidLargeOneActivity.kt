package com.dhanusrisapplication.app.modules.androidlargeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityAndroidLargeOneBinding
import com.dhanusrisapplication.app.modules.androidlargeone.`data`.viewmodel.AndroidLargeOneVM
import com.dhanusrisapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import com.dhanusrisapplication.app.modules.dashboard.ui.DashboardActivity
import com.dhanusrisapplication.app.modules.iphone14one.ui.Iphone14OneActivity
import com.dhanusrisapplication.app.modules.profile.ui.ProfileActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeOneActivity :
    BaseActivity<ActivityAndroidLargeOneBinding>(R.layout.activity_android_large_one) {
  private val viewModel: AndroidLargeOneVM by viewModels<AndroidLargeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcons8peoplew.setOnClickListener {
      val destIntent = Iphone14OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8openboo.setOnClickListener {
      val destIntent = AndroidLargeTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8portrait.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8menurou.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8userThirty.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
