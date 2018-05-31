package com.balivo.gesturedetectdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    internal lateinit var tvSwipDescription: TextView
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
        tvSwipDescription.setOnTouchListener(object : OnSwipeTouchListener(this@MainActivity) {
            override fun onSwipeTop() {
                Toast.makeText(applicationContext, resources.getString(R.string.toastTop), Toast.LENGTH_SHORT).show()
            }

            override fun onSwipeRight() {
                Toast.makeText(applicationContext, resources.getString(R.string.toastRight), Toast.LENGTH_SHORT).show()
            }

            override fun onSwipeLeft() {
                Toast.makeText(applicationContext, resources.getString(R.string.toastLeft), Toast.LENGTH_SHORT).show()
            }

            override fun onSwipeBottom() {
                Toast.makeText(applicationContext, resources.getString(R.string.toastBottom), Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun initializeView() {
        tvSwipDescription = findViewById<View>(R.id.tvSwipDescription) as TextView
    }
}