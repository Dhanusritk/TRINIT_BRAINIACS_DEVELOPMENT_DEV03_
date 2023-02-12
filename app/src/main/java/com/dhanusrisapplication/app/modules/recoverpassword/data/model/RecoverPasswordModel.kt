package com.dhanusrisapplication.app.modules.recoverpassword.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecoverPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoGreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_gogreen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecoverPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recover_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotyourpas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_your_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputinitialValue: String? = null
)
