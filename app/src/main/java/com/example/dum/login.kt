package com.example.dum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val register = findViewById<TextView>(R.id.register) //회원가입 텍스트
        val findid = findViewById<TextView>(R.id.findid) //아이디 찾기 텍스트
        val findpw = findViewById<TextView>(R.id.findpw)//비밀번호 찾기 텍스트
        //회원가입 페이지 가기
        register.setOnClickListener {
            val gotoregister1 = Intent(this, register1::class.java)
            startActivity(gotoregister1)
        }
        //아이디 찾기 페이지 가기
        findid.setOnClickListener {
            val gotofindid_inputnumber = Intent(this, findid_inputnumber::class.java)
            startActivity(gotofindid_inputnumber)
        }
        //비밀번호 찾기 페이지 가기
        findpw.setOnClickListener {
            val gotofindpw_InputId = Intent(this, findpw_InputId::class.java)
            startActivity(gotofindpw_InputId)
        }

    }
}