package com.dhanusrisapplication.app.modules.login.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignInwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignInwithAp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_ap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputinitialValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputinitialOneValue: String? = null
)
