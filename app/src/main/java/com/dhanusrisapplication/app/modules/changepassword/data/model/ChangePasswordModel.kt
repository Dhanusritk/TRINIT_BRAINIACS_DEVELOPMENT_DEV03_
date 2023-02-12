package com.dhanusrisapplication.app.modules.changepassword.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoGreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_gogreen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateanews: String? = MyApp.getInstance().resources.getString(R.string.msg_create_a_new_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpertexther: String? =
      MyApp.getInstance().resources.getString(R.string.msg_at_least_8_char)
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
