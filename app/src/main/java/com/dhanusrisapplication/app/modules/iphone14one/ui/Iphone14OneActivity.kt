package com.dhanusrisapplication.app.modules.iphone14one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityIphone14OneBinding
import com.dhanusrisapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.dhanusrisapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import com.dhanusrisapplication.app.modules.iphone14one.`data`.viewmodel.Iphone14OneVM
import com.dhanusrisapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14OneActivity :
    BaseActivity<ActivityIphone14OneBinding>(R.layout.activity_iphone_14_one) {
  private val viewModel: Iphone14OneVM by viewModels<Iphone14OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSeeReplies.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtReply.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
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
    binding.imageIcons8peoplew.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14OneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
