package com.dhanusrisapplication.app.modules.frame1590.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.frame1590.`data`.model.Frame1590Model
import org.koin.core.KoinComponent

class Frame1590VM : ViewModel(), KoinComponent {
  val frame1590Model: MutableLiveData<Frame1590Model> = MutableLiveData(Frame1590Model())

  var navArguments: Bundle? = null
}
