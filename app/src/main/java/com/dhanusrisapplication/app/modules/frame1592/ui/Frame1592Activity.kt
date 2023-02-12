package com.dhanusrisapplication.app.modules.frame1592.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityFrame1592Binding
import com.dhanusrisapplication.app.modules.frame1591.ui.Frame1591Activity
import com.dhanusrisapplication.app.modules.frame1592.`data`.viewmodel.Frame1592VM
import kotlin.String
import kotlin.Unit

class Frame1592Activity : BaseActivity<ActivityFrame1592Binding>(R.layout.activity_frame_1592) {
  private val viewModel: Frame1592VM by viewModels<Frame1592VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame1592VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumndescription.setOnClickListener {
      val destIntent = Frame1591Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME1592ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame1592Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
