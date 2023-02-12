package com.dhanusrisapplication.app.modules.profiledetails.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfiledetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_profile_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpertexther: String? =
      MyApp.getInstance().resources.getString(R.string.msg_helper_text_her)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaceholder: String? = MyApp.getInstance().resources.getString(R.string.msg_23_december_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpertextherOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_email_addr)
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
  var etEmailValue: String? = null
)
