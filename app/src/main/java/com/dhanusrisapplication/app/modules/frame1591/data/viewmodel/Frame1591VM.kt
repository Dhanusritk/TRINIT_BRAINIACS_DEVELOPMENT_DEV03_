package com.dhanusrisapplication.app.modules.frame1591.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.frame1591.`data`.model.Frame1591Model
import org.koin.core.KoinComponent

class Frame1591VM : ViewModel(), KoinComponent {
  val frame1591Model: MutableLiveData<Frame1591Model> = MutableLiveData(Frame1591Model())

  var navArguments: Bundle? = null
}
