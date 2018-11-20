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




class MainActivity : FragmentActivity(),  DataFragment.OnFragmentInteractionListener, ControlFragment.OnFragmentInteractionListener{
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


        button7.setOnClickListener {

            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent);
        }
        button8.setOnClickListener {
            Toast.makeText(this, "Androidly Short Toasts", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent);
        }
        button9.setOnClickListener {

            val intent = Intent(this, StartScreenActivity::class.java)
            startActivity(intent);
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


}
