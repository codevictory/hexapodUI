package com.example.tommi.hexapoduiapp

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator
import android.R.attr.y
import android.R.attr.x
import android.graphics.*

/*
This is to draw the moving black bar in radar (or red ones)
Can be changed later or implemented in something else
 */



class DrawRadarView : View {

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {}

    // Paint object for coloring and styling
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    // Some colors for the face background, eyes and mouth.
    private var faceColor = Color.RED
    private var eyesColor = Color.BLACK
    private var mouthColor = Color.BLACK
    private var borderColor = Color.BLACK
    // Face border width in pixels
    private var borderWidth = 4.0f
    // View size in pixels
    private var size = 320
    val point1_draw = Point(200, 15)
    val point2_draw = Point(400, 15)
    val point3_draw = Point(500, 250)
    val point4_draw = Point(400, 500)
    val point5_draw = Point(200, 500)
    val point6_draw = Point(100, 250)


    override fun onDraw(canvas: Canvas) {
        // call the super method to keep any drawing from the parent side.
        super.onDraw(canvas)

        drawRadar(canvas)

    }

    private fun drawRadar(canvas: Canvas) {
        // 1
        paint.color = faceColor
        paint.style = Paint.Style.FILL

        // 2
        val radius = size / 2f

        // 3
        canvas.drawRect(0f,canvas.height.toFloat() -20f, 10f,canvas.height.toFloat(), paint)

        // 4
        /*
        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        // 5
        canvas.drawCircle(size / 2f, size / 2f, radius - borderWidth / 2f, paint)
        */
    }

}

