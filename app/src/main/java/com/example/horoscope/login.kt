package com.example.horoscope

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    fun OnEnterBtn(v: View?) {
        val Horoskopiintent = Intent(this, Horoskopi::class.java)
        startActivity(Horoskopiintent)
    }

    fun OnGoBackBtn2(View: View?) {
        finish()
    }

    fun EnterBtn(view: View?) {}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
}