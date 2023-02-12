package com.dhanusrisapplication.app.modules.dashboard.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheme: String? = MyApp.getInstance().resources.getString(R.string.lbl_theme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTamil: String? = MyApp.getInstance().resources.getString(R.string.lbl_tamil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_english)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMalayalam: String? = MyApp.getInstance().resources.getString(R.string.lbl_malayalam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hindi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTelugu: String? = MyApp.getInstance().resources.getString(R.string.lbl_telugu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_back2)

)
