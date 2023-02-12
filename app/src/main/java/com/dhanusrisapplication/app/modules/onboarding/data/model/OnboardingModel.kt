package com.dhanusrisapplication.app.modules.onboarding.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoGreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_gogreen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_provides_a_grea)

)
