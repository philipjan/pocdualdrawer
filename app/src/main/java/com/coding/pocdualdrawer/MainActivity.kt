package com.coding.pocdualdrawer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coding.pocdualdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)
    }

    override fun onResume() {
        super.onResume()
        binder.leftBtn.setOnClickListener {
            binder.drawer.openDrawer(binder.leftNav)
        }
        binder.rightBtn.setOnClickListener {
            binder.drawer.openDrawer(binder.rightNav)
        }
        binder.toolBar.setNavigationOnClickListener {
            binder.drawer.openDrawer(binder.leftNav)
        }
    }
}