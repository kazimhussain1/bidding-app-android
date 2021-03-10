package com.example.bidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        window.statusBarColor = ContextCompat.getColor(this,R.color.colorBlack);

        findViewById<Toolbar>(R.id.toolbar).setNavigationOnClickListener {
            finish();
        }
    }
}