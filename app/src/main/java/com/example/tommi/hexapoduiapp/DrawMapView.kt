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
So far this draws the body of hexapod
 */

class DrawMapView : View {

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
    val point1_draw = Point(200, 150)
    val point2_draw = Point(400, 150)
    val point3_draw = Point(500, 325)
    val point4_draw = Point(400, 500)
    val point5_draw = Point(200, 500)
    val point6_draw = Point(100, 325)


    override fun onDraw(canvas: Canvas) {
        // call the super method to keep any drawing from the parent side.
        super.onDraw(canvas)

        drawFaceBackground(canvas)
        drawHexagon(canvas)
        //drawLegs(canvas)
    }

    private fun drawFaceBackground(canvas: Canvas) {
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

    private fun drawHexagon(canvas: Canvas) {

        paint.color = eyesColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f

        val height = 0 //rootView.measuredHeight
        val width = 0 //rootView.width



        val path = Path()
        path.moveTo(point1_draw.x.toFloat(), point1_draw.y.toFloat())
        path.lineTo(point2_draw.x.toFloat(), point2_draw.y.toFloat())
        path.lineTo(point3_draw.x.toFloat(), point3_draw.y.toFloat())
        path.lineTo(point4_draw.x.toFloat(), point4_draw.y.toFloat())
        path.lineTo(point5_draw.x.toFloat(), point5_draw.y.toFloat())
        path.lineTo(point6_draw.x.toFloat(), point6_draw.y.toFloat())
        path.lineTo(point1_draw.x.toFloat(), point1_draw.y.toFloat())
        path.lineTo(point2_draw.x.toFloat(), point2_draw.y.toFloat())


        //path.close()

        canvas.drawPath(path, paint)
        canvas.drawCircle(point1_draw.x.toFloat(), point1_draw.y.toFloat(),15f,paint)
        canvas.drawCircle(point2_draw.x.toFloat(), point2_draw.y.toFloat(),15f,paint)
        canvas.drawCircle(point3_draw.x.toFloat(), point3_draw.y.toFloat(),15f,paint)
        canvas.drawCircle(point4_draw.x.toFloat(), point4_draw.y.toFloat(),15f,paint)
        canvas.drawCircle(point5_draw.x.toFloat(), point5_draw.y.toFloat(),15f,paint)
        canvas.drawCircle(point6_draw.x.toFloat(), point6_draw.y.toFloat(),15f,paint)


    }

    private fun drawLegs(canvas: Canvas) {


        canvas.drawLine(point2_draw.x.toFloat(), point2_draw.y.toFloat(),point2_draw.x.toFloat()+100
                , point2_draw.y.toFloat()-50,paint)
        canvas.drawCircle(point2_draw.x.toFloat()+100, point2_draw.y.toFloat()-50,15f,paint)
        canvas.drawLine(point2_draw.x.toFloat()+100, point2_draw.y.toFloat()-50,point2_draw.x.toFloat()+200
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