package com.example.evolvo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.evolvo.fragments.DashboardFragment
import com.example.evolvo.fragments.FisioChooseFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.container,DashboardFragment.newIstance(),"dashboard").commit()
        }
        val bottomNavigation: BottomNavigationView = findViewById(R.id.design_bottom_sheet)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        textView = findViewById(R.id.title)
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.action_favourites -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_shop -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_dashboard -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_search -> {
                val songsFragment = FisioChooseFragment.newIstance()
                openFragment(songsFragment, "Cerca tra tutti i trattamenti")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment, text: String) {
        textView.text = text
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
