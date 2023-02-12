package com.dhanusrisapplication.app.modules.signupone.ui

import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivitySignUpOneBinding
import com.dhanusrisapplication.app.modules.signupone.`data`.viewmodel.SignUpOneVM
import kotlin.String
import kotlin.Unit

class SignUpOneActivity : BaseActivity<ActivitySignUpOneBinding>(R.layout.activity_sign_up_one) {
  private val viewModel: SignUpOneVM by viewModels<SignUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_ONE_ACTIVITY"

  }
}
