package com.example.dum

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class findid_inputnumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.findid_inputnumber)

        val ok_button = findViewById<Button>(R.id.ok_button)
        ok_button.setOnClickListener {
            val gotofindid_vc = Intent(this, findid_vc::class.java)
            startActivity(gotofindid_vc)
        }
    }
}