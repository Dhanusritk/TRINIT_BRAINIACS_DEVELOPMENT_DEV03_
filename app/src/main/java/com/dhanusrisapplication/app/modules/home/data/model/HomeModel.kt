package com.dhanusrisapplication.app.modules.home.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrending: String? = MyApp.getInstance().resources.getString(R.string.lbl_trending)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_following)

)
