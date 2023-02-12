package com.dhanusrisapplication.app.modules.frame1590.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityFrame1590Binding
import com.dhanusrisapplication.app.modules.frame1590.`data`.viewmodel.Frame1590VM
import kotlin.String
import kotlin.Unit

class Frame1590Activity : BaseActivity<ActivityFrame1590Binding>(R.layout.activity_frame_1590) {
  private val viewModel: Frame1590VM by viewModels<Frame1590VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame1590VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME1590ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame1590Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
