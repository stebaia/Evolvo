package com.example.evolvo.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.evolvo.MainActivity
import com.example.evolvo.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.*


class SplashActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_layout)
        GlobalScope.launch {
            delay(3000)
            val intent = Intent(this@SplashActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}