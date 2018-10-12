package com.example.harsh.mock_fb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.example.harsh.mock_fb.R
import kotlinx.android.synthetic.main.activity_profile_page.*

class ProfilePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        setSupportActionBar(toolbar as Toolbar?)
        supportActionBar?.title = "Profile"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        btnFinalNext.setOnClickListener {
            startActivity(Intent(this@ProfilePage, InfoActivity::class.java))
        }
    }
}