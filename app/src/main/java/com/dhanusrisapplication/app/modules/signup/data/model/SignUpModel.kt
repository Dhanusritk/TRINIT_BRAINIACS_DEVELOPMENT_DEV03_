package com.dhanusrisapplication.app.modules.signup.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoGreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_gogreen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_looks_like_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtByselectingCr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_selecting_cr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpwithAp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_ap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputinitialValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputinitialOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputinitialTwoValue: String? = null
)
