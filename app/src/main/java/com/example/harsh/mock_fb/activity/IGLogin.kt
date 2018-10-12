package com.example.harsh.mock_fb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.harsh.mock_fb.R
import kotlinx.android.synthetic.main.activity_ig_login.*

class IGLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ig_login)

        btnIGLogin.setOnClickListener {
            startActivity(Intent(this@IGLogin, GoogleLogin::class.java))
        }
    }
}
