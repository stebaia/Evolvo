package com.example.evolvo.activities

import android.os.Bundle
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.evolvo.R
import com.example.evolvo.utils.ChoosePageAdapter

class ChooseTreatmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_treatment_layout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
       // val tabLayout = findViewById<TabLayout>()
        if (viewPager != null) {
            val adapter = ChoosePageAdapter(supportFragmentManager)
            viewPager.adapter = adapter
        }



    }


    }