package com.dhanusrisapplication.app.modules.frame1592.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.frame1592.`data`.model.Frame1592Model
import org.koin.core.KoinComponent

class Frame1592VM : ViewModel(), KoinComponent {
  val frame1592Model: MutableLiveData<Frame1592Model> = MutableLiveData(Frame1592Model())

  var navArguments: Bundle? = null
}
