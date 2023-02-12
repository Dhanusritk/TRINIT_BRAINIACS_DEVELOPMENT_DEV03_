package com.dhanusrisapplication.app.modules.sidemenu.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SideMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSamuel: String? = MyApp.getInstance().resources.getString(R.string.lbl_samuel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_farionwick_gmai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrackyourStat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_track_your_stat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCommunityForum: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_community_forum2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpsFAQs: String? = MyApp.getInstance().resources.getString(R.string.lbl_helps_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup18126Value: String? = null
)
