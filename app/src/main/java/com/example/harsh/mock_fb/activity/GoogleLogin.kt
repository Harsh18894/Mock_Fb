package com.example.harsh.mock_fb.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.harsh.mock_fb.R
import kotlinx.android.synthetic.main.activity_google_login.*

class GoogleLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_login)

        btnNext.setOnClickListener {
            startActivity(Intent(this@GoogleLogin, GoogleLoginNext::class.java))
        }
    }
}