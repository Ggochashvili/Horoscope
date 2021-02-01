package com.example.horoscope

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest

class MainActivity : AppCompatActivity() {

    private lateinit var OnEmailBtn2: EditText
    private lateinit var OnPasswordBtn: EditText
    private lateinit var OnRegistrationBtn3: Button
    private lateinit var OnGoBackBtn: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var RegistrationBtn2: TextView



    fun OnRegistrationBtn2(v: View?) {
        val Registrationintent = Intent(this, Registration::class.java)
        startActivity(Registrationintent)
    }

    fun OnLogInBtn(view: View?) {
        val loginintnt = Intent(this, login::class.java)
        startActivity(loginintnt)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)









    }}











