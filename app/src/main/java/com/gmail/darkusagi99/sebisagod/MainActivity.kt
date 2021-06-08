package com.gmail.darkusagi99.sebisagod

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.SedBtn).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action - Seb est un Dieu", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        findViewById<Button>(R.id.SatrBtn).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action - Seb a toujours raison", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }


}