package com.dhanusrisapplication.app.modules.frame1591.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityFrame1591Binding
import com.dhanusrisapplication.app.modules.frame1591.`data`.viewmodel.Frame1591VM
import kotlin.String
import kotlin.Unit

class Frame1591Activity : BaseActivity<ActivityFrame1591Binding>(R.layout.activity_frame_1591) {
  private val viewModel: Frame1591VM by viewModels<Frame1591VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame1591VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME1591ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame1591Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
