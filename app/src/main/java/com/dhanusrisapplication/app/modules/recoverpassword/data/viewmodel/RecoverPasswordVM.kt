package com.dhanusrisapplication.app.modules.recoverpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.recoverpassword.`data`.model.RecoverPasswordModel
import org.koin.core.KoinComponent

class RecoverPasswordVM : ViewModel(), KoinComponent {
  val recoverPasswordModel: MutableLiveData<RecoverPasswordModel> =
      MutableLiveData(RecoverPasswordModel())

  var navArguments: Bundle? = null
}
