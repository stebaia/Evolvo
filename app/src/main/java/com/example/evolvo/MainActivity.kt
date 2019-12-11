package com.example.evolvo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.evolvo.fragments.DashboardFragment

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.container,DashboardFragment.newIstance(),"dashboard").commit()
        }
    }
}
