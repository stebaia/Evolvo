package com.example.evolvo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.evolvo.R

class DashboardFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard_menu, container, false)
        /*var card_health  = view.findViewById<CardView>(R.id.card_health)
        var card_beauty  = view.findViewById<CardView>(R.id.card_beauty)
        var card_sport  = view.findViewById<CardView>(R.id.card_sport)
        var card_search  = view.findViewById<CardView>(R.id.card_search)
        var card_favourites  = view.findViewById<CardView>(R.id.card_favourites)
        var card_shop  = view.findViewById<CardView>(R.id.card_shop)
        card_health.setOnClickListener{

        }*/
        return view
    }

    companion object{
        private val ARG_CAUGHT = "myFragment_cought"
        fun newIstance():DashboardFragment{
            val args: Bundle = Bundle()
            val fragment = DashboardFragment()
            return fragment
        }
    }


}