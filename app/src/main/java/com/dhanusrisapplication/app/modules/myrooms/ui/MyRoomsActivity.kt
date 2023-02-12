package com.dhanusrisapplication.app.modules.myrooms.ui

import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivityMyRoomsBinding
import com.dhanusrisapplication.app.modules.myrooms.`data`.viewmodel.MyRoomsVM
import com.dhanusrisapplication.app.modules.sidemenu.ui.SideMenuActivity
import kotlin.String
import kotlin.Unit

class MyRoomsActivity : BaseActivity<ActivityMyRoomsBinding>(R.layout.activity_my_rooms) {
  private val viewModel: MyRoomsVM by viewModels<MyRoomsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myRoomsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleftOne.setOnClickListener {
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnuser.setOnClickListener {
      val destIntent = SideMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MY_ROOMS_ACTIVITY"

  }
}
