package com.dhanusrisapplication.app.modules.trackorderone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.trackorderone.`data`.model.TrackOrderOneModel
import org.koin.core.KoinComponent

class TrackOrderOneVM : ViewModel(), KoinComponent {
  val trackOrderOneModel: MutableLiveData<TrackOrderOneModel> =
      MutableLiveData(TrackOrderOneModel())

  var navArguments: Bundle? = null
}
