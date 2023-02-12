package com.dhanusrisapplication.app.modules.filldetails.ui

import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityFilldetailsBinding
import com.dhanusrisapplication.app.modules.filldetails.`data`.viewmodel.FilldetailsVM
import kotlin.String
import kotlin.Unit

class FilldetailsActivity : BaseActivity<ActivityFilldetailsBinding>(R.layout.activity_filldetails)
    {
  private val viewModel: FilldetailsVM by viewModels<FilldetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filldetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FILLDETAILS_ACTIVITY"

  }
}
