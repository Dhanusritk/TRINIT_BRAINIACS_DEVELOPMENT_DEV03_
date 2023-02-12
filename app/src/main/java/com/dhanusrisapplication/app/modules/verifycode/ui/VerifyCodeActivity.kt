package com.dhanusrisapplication.app.modules.verifycode.ui

import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityVerifyCodeBinding
import com.dhanusrisapplication.app.modules.verifycode.`data`.viewmodel.VerifyCodeVM
import kotlin.String
import kotlin.Unit

class VerifyCodeActivity : BaseActivity<ActivityVerifyCodeBinding>(R.layout.activity_verify_code) {
  private val viewModel: VerifyCodeVM by viewModels<VerifyCodeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.verifyCodeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VERIFY_CODE_ACTIVITY"

  }
}
