package com.dhanusrisapplication.app.modules.sidemenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.databinding.ActivitySideMenuBinding
import com.dhanusrisapplication.app.modules.chat.ui.ChatActivity
import com.dhanusrisapplication.app.modules.dashboard.ui.DashboardActivity
import com.dhanusrisapplication.app.modules.frame1590.ui.Frame1590Activity
import com.dhanusrisapplication.app.modules.login.ui.LoginActivity
import com.dhanusrisapplication.app.modules.sidemenu.`data`.viewmodel.SideMenuVM
import kotlin.String
import kotlin.Unit

class SideMenuActivity : BaseActivity<ActivitySideMenuBinding>(R.layout.activity_side_menu) {
  private val viewModel: SideMenuVM by viewModels<SideMenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sideMenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSettingsOne.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowvolume.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTrackyourStat.setOnClickListener {
      val destIntent = Frame1590Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etGroup18126.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIDE_MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SideMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
