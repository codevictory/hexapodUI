package com.example.tommi.hexapoduiapp
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.graphics.Path
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.view.animation.LinearInterpolator
import android.view.animation.PathInterpolator
import android.view.animation.ScaleAnimation
import kotlinx.android.synthetic.main.activity_map.*
import android.view.animation.Animation




class MapActivity : AppCompatActivity() {

    //Now this can draw what is on drawing class

    lateinit var rocket: View
    lateinit var framelayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //radarMapView.addView(Rectangle(this.requireContext()))
        setContentView(R.layout.activity_map)

         rocket = findViewById<View>(R.id.drawMapView)

        framelayout = findViewById<ConstraintLayout>(R.id.layout)

        framelayout.setOnClickListener { onStartAnimation() }


    }

    private fun onStartAnimation(){


        //This function can be called after we get the radar data
        //First parameter is the View we want to draw
        //StartScale would always be 0, and in endScale is some float in meters
        //describing how far the object is from radar
        //For example 16

        //scaleView(rocket, 1f, 30f)

    }
/*
//This is old animation fuction
    fun scaleView(v: View, startScale: Float, endScale: Float) {
        val anim = ScaleAnimation(
                1f, 1f, // Start and end values for the X axis scaling
                1f, endScale, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 0f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, 1f) // Pivot point of Y scaling
        anim.fillAfter = true // Needed to keep the result of the animation
        anim.duration = 2000
        v.startAnimation(anim)
    }
    */
}

