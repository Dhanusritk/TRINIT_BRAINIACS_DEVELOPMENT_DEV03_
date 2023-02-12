package com.dhanusrisapplication.app.modules.sidemenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.sidemenu.`data`.model.SideMenuModel
import org.koin.core.KoinComponent

class SideMenuVM : ViewModel(), KoinComponent {
  val sideMenuModel: MutableLiveData<SideMenuModel> = MutableLiveData(SideMenuModel())

  var navArguments: Bundle? = null
}
