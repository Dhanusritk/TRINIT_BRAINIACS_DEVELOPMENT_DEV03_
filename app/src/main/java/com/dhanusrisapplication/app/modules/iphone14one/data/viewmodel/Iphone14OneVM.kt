package com.dhanusrisapplication.app.modules.iphone14one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.iphone14one.`data`.model.Iphone14OneModel
import org.koin.core.KoinComponent

class Iphone14OneVM : ViewModel(), KoinComponent {
  val iphone14OneModel: MutableLiveData<Iphone14OneModel> = MutableLiveData(Iphone14OneModel())

  var navArguments: Bundle? = null
}
