package com.example.dum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class register1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register1)
        val okButton = findViewById<android.widget.Button>(R.id.ok_button)
        okButton.setOnClickListener {
            val gotoregister2 = Intent(this, register2::class.java)
            startActivity(gotoregister2)
        }
    }
}