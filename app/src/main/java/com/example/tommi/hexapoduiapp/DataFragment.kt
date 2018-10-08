package com.example.tommi.hexapoduiapp



import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.RelativeLayout







// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [DataFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [DataFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class DataFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val view: View = inflater.inflate(R.layout.fragment_data, container, false)

        val relativeLayout = view.findViewById(R.id.fragment_data) as RelativeLayout
        relativeLayout.addView(Rectangle(this.requireContext()))


     return view
    }


    // TODO: Rename method, update argument and hook method into UI event
/*
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
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
         * @return A new instance of fragment DataFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                DataFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    private inner class Rectangle(context: Context) : View(context) {
        internal var paint = Paint()
        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(158, 174, 179)
            val width = getWidth()
            val height = getHeight()
            val brush1 = Paint ()
            val lineLenght = 150 .toFloat()
            val radius = 150
            val startx1 = (width / 2)-106 .toFloat()
            val starty1 = (height / 2)+106 .toFloat()
            val endx1 = startx1 - lineLenght
            val endy1 = starty1
            val startx2 = (width / 2)+106 .toFloat()
            val starty2 = (height / 2)+106 .toFloat()
            val endx2 = startx2 + lineLenght
            val endy2 = starty2
            val startx3 = (width / 2)-150 .toFloat()
            val starty3 = (height / 2) .toFloat()
            val endx3 = startx3 - lineLenght
            val endy3 = starty3
            val startx4 = (width / 2)+150 .toFloat()
            val starty4 = (height / 2) .toFloat()
            val endx4 = startx4 + lineLenght
            val endy4 = starty4
            val startx5 = (width / 2)-106 .toFloat()
            val starty5 = (height / 2)-106 .toFloat()
            val endx5 = startx5 - lineLenght
            val endy5 = starty5
            val startx6 = (width / 2)+106 .toFloat()
            val starty6 = (height / 2)-106 .toFloat()
            val endx6 = startx6 + lineLenght
            val endy6 = starty6
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
            canvas.drawRect(rect, paint)
        }
    }
}
