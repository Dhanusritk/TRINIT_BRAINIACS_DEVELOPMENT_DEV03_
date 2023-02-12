package com.dhanusrisapplication.app.modules.iphone14two.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.iphone14two.`data`.model.Iphone14TwoModel
import org.koin.core.KoinComponent

class Iphone14TwoVM : ViewModel(), KoinComponent {
  val iphone14TwoModel: MutableLiveData<Iphone14TwoModel> = MutableLiveData(Iphone14TwoModel())

  var navArguments: Bundle? = null
}
