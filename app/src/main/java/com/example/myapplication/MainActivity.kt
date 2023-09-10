package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var etEmail:EditText
    lateinit var etNewPassword:EditText
    lateinit var etConfirmPassword:EditText
    lateinit var btnSignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        etNewPassword=findViewById(R.id.etNewPassword)
        etConfirmPassword=findViewById(R.id.etConfirmPassword)
        btnSignup=findViewById(R.id.btnSignUp)

        btnSignup.setOnClickListener {
            if (etName.text.isEmpty()){
                etName.error="Enter your Name"
            }else if (etNewPassword.text.isEmpty()){
                etNewPassword.error="Enter Your Password"
            }else if (etConfirmPassword.text.isEmpty()){
                etConfirmPassword.error="Enter your Password"
            }else{
                System.out.println("SignUp")
            }
        }
    }
    }
