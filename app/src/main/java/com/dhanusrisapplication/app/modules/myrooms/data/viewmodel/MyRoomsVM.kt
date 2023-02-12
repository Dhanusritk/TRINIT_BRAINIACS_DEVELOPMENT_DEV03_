package com.dhanusrisapplication.app.modules.myrooms.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.myrooms.`data`.model.MyRoomsModel
import org.koin.core.KoinComponent

class MyRoomsVM : ViewModel(), KoinComponent {
  val myRoomsModel: MutableLiveData<MyRoomsModel> = MutableLiveData(MyRoomsModel())

  var navArguments: Bundle? = null
}
