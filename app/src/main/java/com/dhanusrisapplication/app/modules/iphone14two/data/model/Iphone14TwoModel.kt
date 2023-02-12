package com.dhanusrisapplication.app.modules.iphone14two.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14TwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDhanusritk: String? = MyApp.getInstance().resources.getString(R.string.lbl_dhanusri_tk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekday: String? = MyApp.getInstance().resources.getString(R.string.msg_posted_wednesda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIamgrowingDr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_am_growing_dr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTypeyoureply: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_type_you_reply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_mr_anonymous_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrymixingsome: String? =
      MyApp.getInstance().resources.getString(R.string.msg_try_mixing_some)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_gokul_mathi_1d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEncouragenatur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_encourage_natur)

)
