package com.dhanusrisapplication.app.modules.chat.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
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
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_08_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_aloe_vera_is2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoyouknowwha: String? = MyApp.getInstance().resources.getString(R.string.msg_it_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoyouknowwhaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_can_anybody_sug)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_reply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputMessageEValue: String? = null
)
