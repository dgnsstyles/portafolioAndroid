package com.example.davidgoren.portafolio.controller

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.davidgoren.portafolio.view.AboutFragment
import com.example.davidgoren.portafolio.view.ContactFragment
import com.example.davidgoren.portafolio.view.SkillsFragment
import com.example.davidgoren.portafolio.view.WorkFragment

class DevPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment? {
         when(position){
             0 -> return AboutFragment()
             1 ->  return WorkFragment()
             2 -> return SkillsFragment()
             3 -> return ContactFragment()

         }
        return null
    }

    override fun getCount(): Int {
        return 4
    }
    override fun getPageTitle(position: Int): CharSequence?{
        when(position) {
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }
        return null
    }

}