package com.example.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.example.horoscope.Horoskopi
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.horoscope.R
import com.google.firebase.auth.FirebaseAuth

class Registration : AppCompatActivity(){


    fun OnRegistrationBtn3(view: View?) {
        val Horoskopiintent = Intent(this, Horoskopi::class.java)
        startActivity(Horoskopiintent)
    }

    fun OnRegistrationBtn2(view: View?) {}
    fun OnGoBackBtn2(view: View?) {
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


    }
}









