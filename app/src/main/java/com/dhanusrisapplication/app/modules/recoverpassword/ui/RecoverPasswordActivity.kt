package com.dhanusrisapplication.app.modules.recoverpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityRecoverPasswordBinding
import com.dhanusrisapplication.app.modules.recoverpassword.`data`.viewmodel.RecoverPasswordVM
import kotlin.String
import kotlin.Unit

class RecoverPasswordActivity :
    BaseActivity<ActivityRecoverPasswordBinding>(R.layout.activity_recover_password) {
  private val viewModel: RecoverPasswordVM by viewModels<RecoverPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recoverPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RECOVER_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecoverPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
