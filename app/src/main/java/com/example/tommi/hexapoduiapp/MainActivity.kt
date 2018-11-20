package com.example.tommi.hexapoduiapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_data.*
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.view.View
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar


class MainActivity : FragmentActivity(),  DataFragment.OnFragmentInteractionListener, ControlFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when (item.itemId) {

             R.id.navigation_data -> {
                val newFragment = DataFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.container, newFragment)
                transaction.addToBackStack(null)
                transaction.commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_control -> {
                val newFragment = ControlFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.container, newFragment)
                transaction.addToBackStack(null)
                transaction.commit()

                return@OnNavigationItemSelectedListener true
            }

        }
        false


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        /*
        //This is how to make start screen open at first but so far it just creates and endless loop
        val intent = Intent(this, StartScreenActivity::class.java)
        startActivity(intent);
        */
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val newFragment = DataFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newFragment)
        transaction.addToBackStack(null)
        transaction.commit()



       imageButton.setOnClickListener {

            val intent = Intent(this, StartScreenActivity::class.java)
            startActivity(intent);
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}
