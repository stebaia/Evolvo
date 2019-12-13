package com.example.evolvo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.evolvo.fragments.DashboardFragment
import com.example.evolvo.fragments.FisioChooseFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.container,DashboardFragment.newIstance(),"dashboard").commit()
        }
        val bottomNavigation: BottomNavigationView = findViewById(R.id.design_bottom_sheet)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }


    val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item ->
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
                openFragment(songsFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
