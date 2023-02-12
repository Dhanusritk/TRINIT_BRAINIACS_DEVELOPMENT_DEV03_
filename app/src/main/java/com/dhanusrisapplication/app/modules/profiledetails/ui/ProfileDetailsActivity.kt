package com.dhanusrisapplication.app.modules.profiledetails.ui

import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityProfileDetailsBinding
import com.dhanusrisapplication.app.modules.profiledetails.`data`.viewmodel.ProfileDetailsVM
import kotlin.String
import kotlin.Unit

class ProfileDetailsActivity :
    BaseActivity<ActivityProfileDetailsBinding>(R.layout.activity_profile_details) {
  private val viewModel: ProfileDetailsVM by viewModels<ProfileDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_DETAILS_ACTIVITY"

  }
}
