package com.dhanusrisapplication.app.modules.signupone.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpOneModel(
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
  var txtWHOAREYOU: String? = MyApp.getInstance().resources.getString(R.string.lbl_who_are_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)

)
