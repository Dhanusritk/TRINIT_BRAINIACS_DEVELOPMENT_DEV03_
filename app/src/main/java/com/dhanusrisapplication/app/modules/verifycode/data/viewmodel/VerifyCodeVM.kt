package com.dhanusrisapplication.app.modules.verifycode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dhanusrisapplication.app.modules.verifycode.`data`.model.VerifyCodeModel
import org.koin.core.KoinComponent

class VerifyCodeVM : ViewModel(), KoinComponent {
  val verifyCodeModel: MutableLiveData<VerifyCodeModel> = MutableLiveData(VerifyCodeModel())

  var navArguments: Bundle? = null
}
