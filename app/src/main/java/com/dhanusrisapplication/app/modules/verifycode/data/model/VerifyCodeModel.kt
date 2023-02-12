package com.dhanusrisapplication.app.modules.verifycode.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VerifyCodeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoGreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_gogreen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifyCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_verify_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnauthenticati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_an_authenticati)

)
