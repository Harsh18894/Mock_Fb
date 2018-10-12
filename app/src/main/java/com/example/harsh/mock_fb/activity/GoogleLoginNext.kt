package com.example.harsh.mock_fb.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.harsh.mock_fb.R
import kotlinx.android.synthetic.main.activity_google_login_next.*

class GoogleLoginNext : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_login_next)

        btnNext.setOnClickListener {
            startActivity(Intent(this@GoogleLoginNext, ProfilePage::class.java))
        }
    }
}