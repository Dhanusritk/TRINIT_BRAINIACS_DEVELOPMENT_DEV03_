package com.dhanusrisapplication.app.modules.profile.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_farmer_ruben_ge)
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
  var txtSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBacktohomepa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_back_to_home_pa)

)
