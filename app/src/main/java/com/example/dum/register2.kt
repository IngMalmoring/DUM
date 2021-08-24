package com.example.dum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register2)
        val ok_button = findViewById<Button>(R.id.ok_button)
        ok_button.setOnClickListener {
            val gotoregister_final = Intent(this,register_final::class.java)
            startActivity(gotoregister_final)
        }
    }
}