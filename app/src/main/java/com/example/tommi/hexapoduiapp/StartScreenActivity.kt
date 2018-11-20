package com.example.tommi.hexapoduiapp

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AlertDialog
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_start_screen.*

class StartScreenActivity : FragmentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
        launchButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        }
        connectionButton.setOnClickListener{
            // Here starts function/service which makes the cpnnection to robot
            // Shows a loading animation
            // Creates a toast to inform if we have connection or not
            // Turns button text to Disconnect if we have connection
            Toast.makeText(this, "Creating connection...", Toast.LENGTH_LONG).show()

        }
        infoButton.setOnClickListener{
            // open a pop up window or toast

            Toast.makeText(this, "Click connect to robot. When connection is set, click Launch App!", Toast.LENGTH_LONG).show()

        }

    }
}
