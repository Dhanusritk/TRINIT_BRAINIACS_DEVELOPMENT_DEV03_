package com.dhanusrisapplication.app.modules.filldetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.filldetails.`data`.model.FilldetailsModel
import org.koin.core.KoinComponent

class FilldetailsVM : ViewModel(), KoinComponent {
  val filldetailsModel: MutableLiveData<FilldetailsModel> = MutableLiveData(FilldetailsModel())

  var navArguments: Bundle? = null
}
