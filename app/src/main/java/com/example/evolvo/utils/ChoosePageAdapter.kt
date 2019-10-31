package com.example.evolvo.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.evolvo.fragments.BeautyChooseFragment
import com.example.evolvo.fragments.FisioChooseFragment

class ChoosePageAdapter internal constructor(fm : FragmentManager) : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    private val COUNT = 2


    override fun getItem(position: Int): Fragment {
        var fragment: Fragment = FisioChooseFragment()
        when(position){
            0 -> fragment = FisioChooseFragment()
            1 -> fragment = BeautyChooseFragment()
        }
        return fragment
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }

}