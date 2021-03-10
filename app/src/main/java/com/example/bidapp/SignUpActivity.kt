package com.example.bidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        window.statusBarColor = ContextCompat.getColor(this, R.color.colorBlack);

        findViewById<ScrollView>(R.id.scroll_view).clipToOutline = true

        findViewById<Toolbar>(R.id.toolbar).setNavigationOnClickListener {
            finish();
        }
    }
}