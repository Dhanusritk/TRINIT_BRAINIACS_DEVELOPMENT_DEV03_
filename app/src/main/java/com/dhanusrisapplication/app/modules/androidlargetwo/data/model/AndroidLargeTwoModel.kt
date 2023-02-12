package com.dhanusrisapplication.app.modules.androidlargetwo.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPLANTDICTIONAR: String? =
      MyApp.getInstance().resources.getString(R.string.msg_plant_dictionar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1ArumLily: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_arum_lily)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_arum_lily_zant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReadmore: String? = MyApp.getInstance().resources.getString(R.string.lbl_read_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_bambusa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bambusa_is_a_ge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReadmoreOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_read_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburlOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_cactus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_cactus_is_a_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReadmoreTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_read_more)

)
