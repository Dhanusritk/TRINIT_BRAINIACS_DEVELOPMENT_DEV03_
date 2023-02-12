package com.dhanusrisapplication.app.modules.filldetails.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilldetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoGreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_gogreen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_fill_in_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindlyfillthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindly_fill_the)
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
