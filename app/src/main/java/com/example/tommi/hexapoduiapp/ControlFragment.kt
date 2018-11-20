package com.example.tommi.hexapoduiapp

import android.animation.ObjectAnimator
import android.animation.ValueAnimator.REVERSE
import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.net.Uri
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_control.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ControlFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ControlFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ControlFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null
    lateinit var leg: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /*
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }*/
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_control, container,
                false)
        val activity = activity
        val verticalDivider2 = view.findViewById<ConstraintLayout>(R.id.robotLayout) as ConstraintLayout
        leg = verticalDivider2.findViewById(R.id.drawHexapodLegView) as View

        //Starting animation
        //Should be in other function


        leg.setOnClickListener(){
            leg.pivotX = 0f
            leg.pivotY = 0f
            val animator = ObjectAnimator.ofFloat(leg, "rotation", 0f, 39f)

            animator.setRepeatCount(ObjectAnimator.INFINITE);
            animator.setRepeatMode(ObjectAnimator.REVERSE);
            animator.start()

        }
        ObjectAnimator.ofFloat(leg, "rotation", 0f, 90f)
        val verticalDivider = view.findViewById<LinearLayout>(R.id.layout1) as LinearLayout

        //val relativeLayout = view.findViewById(R.id.drawView) as RelativeLayout
        //relativeLayout.addView(Rectangle(this.requireContext()))
        val horizontalDivider = verticalDivider.findViewById<LinearLayout>(R.id.layout2) as LinearLayout
        val horizontalDivider2 = verticalDivider.findViewById<LinearLayout>(R.id.layout3) as LinearLayout

        val button1 = horizontalDivider.findViewById<Button>(R.id.button) as Button
        val button2 = horizontalDivider.findViewById<Button>(R.id.button2) as Button
        val button3 = horizontalDivider.findViewById<Button>(R.id.button3) as Button
        val button4 = horizontalDivider2.findViewById<Button>(R.id.button4) as Button
        val button5 = horizontalDivider2.findViewById<Button>(R.id.button5) as Button
        val button6 = horizontalDivider2.findViewById<Button>(R.id.button6) as Button

        button1.setOnClickListener(){
            Toast.makeText(context, "Button1", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener(){
            Toast.makeText(context, "Button2", Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener(){
            Toast.makeText(context, "Button3", Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener(){
            Toast.makeText(context, "Button4", Toast.LENGTH_SHORT).show()
        }
        button5.setOnClickListener(){
            Toast.makeText(context, "Button5", Toast.LENGTH_SHORT).show()
        }
        button6.setOnClickListener(){
            Toast.makeText(context, "Button6", Toast.LENGTH_SHORT).show()
        }
        return view
    }

    // TODO: Rename method, update argument and hook method into UI event
/*
    fun Button1() {

        Toast.makeText(context, "Androidly Short Toasts", Toast.LENGTH_SHORT).show()
    }
*/

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ControlFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                ControlFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    /*
    //I think this is not needed anymore

    private inner class Rectangle(context: Context) : View(context) {
        //
        /*
        val tx1 = ObjectAnimator.ofFloat(myRectangleView, View.TRANSLATION_Y, 0f, 200f)
        tx1.setDuration(1000)
        tx1.start()
*/
        internal var paint = Paint()
        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(158, 174, 179)
            val width = getWidth()
            val height = getHeight()
            val brush1 = Paint ()
            val lineLenght = 150 .toFloat()
            val radius = 150
            val minus = -110 .toFloat()
            val startx1 = (width / 2)-106 .toFloat()
            val starty1 = (height / 2)+106 .toFloat()
            val endx1 = startx1 - lineLenght
            val endy1 = starty1
            val zx1 = endx1 - lineLenght
            val zy1 = endy1 - minus
            val startx2 = (width / 2)+106 .toFloat()
            val starty2 = (height / 2)+106 .toFloat()
            val endx2 = startx2 + lineLenght
            val endy2 = starty2
            val zx2 = endx2 + lineLenght
            val zy2 = endy2- minus
            val startx3 = (width / 2)-150 .toFloat()
            val starty3 = (height / 2) .toFloat()
            val endx3 = startx3 - lineLenght
            val endy3 = starty3
            val zx3 = endx3 - lineLenght
            val zy3 = endy3- minus
            val startx4 = (width / 2)+150 .toFloat()
            val starty4 = (height / 2) .toFloat()
            val endx4 = startx4 + lineLenght
            val endy4 = starty4
            val zx4 = endx4 + lineLenght
            val zy4 = endy4- minus
            val startx5 = (width / 2)-106 .toFloat()
            val starty5 = (height / 2)-106 .toFloat()
            val endx5 = startx5 - lineLenght
            val endy5 = starty5
            val zx5 = endx5 - lineLenght
            val zy5 = endy5- minus
            val startx6 = (width / 2)+106 .toFloat()
            val starty6 = (height / 2)-106 .toFloat()
            val endx6 = startx6 + lineLenght
            val endy6 = starty6
            val zx6 = endx6 + lineLenght
            val zy6 = endy6- minus
            brush1.setARGB (255, 255, 0, 0)
            brush1.setStyle (Paint.Style.STROKE)
            brush1.setStrokeWidth(4 .toFloat())
            for (f in 0..9)
                canvas.drawCircle ((width / 2) .toFloat (), (height / 2) .toFloat (), (f * 100) .toFloat (), brush1)
            paint.setColor(Color.BLACK)
            paint.setStyle (Paint.Style.STROKE)
            paint.setStrokeWidth(30 .toFloat())
            val rect = Rect((width / 2) +400, (height / 2)-600, (height / 2),(width / 2)-200 )
            canvas.drawCircle ((width / 2) .toFloat (), (height / 2) .toFloat (), (150) .toFloat (), paint)
            canvas.drawLine(startx1,starty1,endx1,endy1, paint)
            canvas.drawLine(startx2,starty2,endx2,endy2, paint)
            canvas.drawLine(startx3,starty3,endx3,endy3, paint)
            canvas.drawLine(startx4,starty4,endx4,endy4, paint)
            canvas.drawLine(startx5,starty5,endx5,endy5, paint)
            canvas.drawLine(startx6,starty6,endx6,endy6, paint)
            canvas.drawLine(endx1,endy1,zx1,zy1, paint)
            canvas.drawLine(endx2,endy2,zx2,zy2, paint)
            canvas.drawLine(endx3,endy3,zx3,zy3, paint)
            canvas.drawLine(endx4,endy4,zx4,zy4, paint)
            canvas.drawLine(endx5,endy5,zx5,zy5, paint)
            canvas.drawLine(endx6,endy6,zx6,zy6, paint)

            //canvas.drawRect(rect, paint)
        }
    }
    */
}
