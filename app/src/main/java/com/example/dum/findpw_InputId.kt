package com.example.dum

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class findpw_InputId : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.findpw_inputid)
        val ok_button = findViewById<android.widget.Button>(R.id.ok_button)

        ok_button.setOnClickListener {
            val gotofindpw_ChangePw = Intent(this, findpw_ChangePw::class.java)
            startActivity(gotofindpw_ChangePw)
        }
    }
}