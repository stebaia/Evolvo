package com.example.evolvo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_chose_layout)
        var card_health  = findViewById<CardView>(R.id.card_health)
        var card_beauty  = findViewById<CardView>(R.id.card_beauty)
        var card_sport  = findViewById<CardView>(R.id.card_sport)
        var card_search  = findViewById<CardView>(R.id.card_search)
        var card_favourites  = findViewById<CardView>(R.id.card_favourites)
        var card_shop  = findViewById<CardView>(R.id.card_shop)
        card_health.setOnClickListener{

        }

    }
}
