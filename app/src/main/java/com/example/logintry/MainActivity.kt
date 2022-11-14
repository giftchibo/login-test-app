package com.example.logintry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            var user_name = et_user_name.text.toString()
            val password = et_password.text.toString()
            if (user_name == "gift" && password == "123") {
                Toast.makeText(
                    this@MainActivity,
                    "welcome $user_name .Logged in sucuffully ",
                    Toast.LENGTH_LONG
                ).show()

            } else {

                Toast.makeText(this@MainActivity, "incorrect login", Toast.LENGTH_LONG).show()
                // your code to validate the user_name and password combination
                // and verify the same

            }


        }
    }
}