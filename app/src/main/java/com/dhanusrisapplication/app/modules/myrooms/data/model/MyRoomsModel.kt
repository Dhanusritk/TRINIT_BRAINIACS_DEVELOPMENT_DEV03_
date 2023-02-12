package com.dhanusrisapplication.app.modules.myrooms.`data`.model

import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyRoomsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGOVTANNOUNCEME: String? =
      MyApp.getInstance().resources.getString(R.string.msg_govt_announceme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_agriculture_and)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKarnataka: String? = MyApp.getInstance().resources.getString(R.string.lbl_karnataka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFARMINGAGREEME: String? =
      MyApp.getInstance().resources.getString(R.string.msg_farming_agreeme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTamilnadu: String? = MyApp.getInstance().resources.getString(R.string.lbl_tamilnadu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoancancellati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_loan_cancellati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBihar: String? = MyApp.getInstance().resources.getString(R.string.lbl_bihar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFans: String? = MyApp.getInstance().resources.getString(R.string.lbl_fans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeviceCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_device)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmartLight: String? = MyApp.getInstance().resources.getString(R.string.lbl_smart_light)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeviceCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_device)

)
