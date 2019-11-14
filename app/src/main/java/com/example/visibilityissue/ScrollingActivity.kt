package com.example.visibilityissue

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        button1.setOnClickListener {
            test.visibility = View.VISIBLE
        }
        button2.setOnClickListener {
            test.visibility = View.VISIBLE
            test.requestLayout();
        }
    }
}
