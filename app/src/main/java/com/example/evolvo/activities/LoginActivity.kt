package com.example.evolvo.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.evolvo.MainActivity
import com.example.evolvo.R


class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_layout)
        val btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener{
            val intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}