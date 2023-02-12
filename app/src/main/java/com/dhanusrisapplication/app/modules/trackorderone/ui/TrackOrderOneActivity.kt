package com.dhanusrisapplication.app.modules.trackorderone.ui

import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityTrackOrderOneBinding
import com.dhanusrisapplication.app.modules.trackorderone.`data`.viewmodel.TrackOrderOneVM
import kotlin.String
import kotlin.Unit

class TrackOrderOneActivity :
    BaseActivity<ActivityTrackOrderOneBinding>(R.layout.activity_track_order_one) {
  private val viewModel: TrackOrderOneVM by viewModels<TrackOrderOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trackOrderOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRACK_ORDER_ONE_ACTIVITY"

  }
}
