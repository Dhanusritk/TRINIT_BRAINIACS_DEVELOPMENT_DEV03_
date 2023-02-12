package com.dhanusrisapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dhanusrisapplication.app.R
import com.dhanusrisapplication.app.appcomponents.base.BaseActivity
import com.dhanusrisapplication.app.appcomponents.googleauth.GoogleHelper
import com.dhanusrisapplication.app.databinding.ActivityLoginBinding
import com.dhanusrisapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.dhanusrisapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.dhanusrisapplication.app.modules.recoverpassword.ui.RecoverPasswordActivity
import com.dhanusrisapplication.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        val destIntent = AndroidLargeOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.txtLanguage.setOnClickListener {
        val destIntent = RecoverPasswordActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtLanguageOne.setOnClickListener {
        val destIntent = SignUpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
