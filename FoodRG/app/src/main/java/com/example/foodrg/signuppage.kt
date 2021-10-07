package com.example.foodrg

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.page_2.*
import kotlinx.android.synthetic.main.signup_page.*

class signuppage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)
        sign_in_button.setOnClickListener{startActivity(Intent(this, page2::class.java))}

    }
}