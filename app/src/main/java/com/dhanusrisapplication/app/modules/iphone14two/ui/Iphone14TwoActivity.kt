package com.dhanusrisapplication.app.modules.iphone14two.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityIphone14TwoBinding
import com.dhanusrisapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.dhanusrisapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import com.dhanusrisapplication.app.modules.iphone14one.ui.Iphone14OneActivity
import com.dhanusrisapplication.app.modules.iphone14two.`data`.viewmodel.Iphone14TwoVM
import kotlin.String
import kotlin.Unit

class Iphone14TwoActivity :
    BaseActivity<ActivityIphone14TwoBinding>(R.layout.activity_iphone_14_two) {
  private val viewModel: Iphone14TwoVM by viewModels<Iphone14TwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14TwoVM = viewModel
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
    binding.imageIcons8homepag.setOnClickListener {
      val destIntent = AndroidLargeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14TwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
