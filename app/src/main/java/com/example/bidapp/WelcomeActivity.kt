package com.example.bidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        findViewById<View>(R.id.btn_login).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        findViewById<View>(R.id.btn_sign_up).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}