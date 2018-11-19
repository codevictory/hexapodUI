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
This draws one leg of hexapod

Trying to animate the leg movement with this


 */

class DrawHexapodLegView : View {

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
    val point1_draw = Point(rootView.width, 115)
    val point2_draw = Point(0, 0)
    val point3_draw = Point(500, 250)
    val point4_draw = Point(400, 500)
    val point5_draw = Point(200, 500)
    val point6_draw = Point(100, 250)


    override fun onDraw(canvas: Canvas) {
        // call the super method to keep any drawing from the parent side.
        super.onDraw(canvas)


        drawLegs(canvas)
    }

    public fun drawLegs(canvas: Canvas) {

        paint.color = eyesColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f
        canvas.drawLine(point2_draw.x.toFloat(), point2_draw.y.toFloat(),point2_draw.x.toFloat()+100
                , point2_draw.y.toFloat()+50,paint)
        canvas.drawCircle(point2_draw.x.toFloat()+100, point2_draw.y.toFloat()+50,15f,paint)
        canvas.drawLine(point2_draw.x.toFloat()+100, point2_draw.y.toFloat()+50,point2_draw.x.toFloat()+200
                , point2_draw.y.toFloat(),paint)


    }
    private fun countLegPositions(){
        var legLength = 150f
        var startX = 0
        var startY = 0
        var middleX = 0
        var middleY = 0
        var endX = 0
        var ednY = 0

    }

}
