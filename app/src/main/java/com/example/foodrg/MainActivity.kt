package com.example.foodrg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log_button.setOnClickListener{startActivity(Intent(this, page2::class.java))}
        button2.setOnClickListener{startActivity(Intent(this, signuppage::class.java))}
        button3.setOnClickListener{startActivity(Intent(this, signuppage::class.java))}

    }
}