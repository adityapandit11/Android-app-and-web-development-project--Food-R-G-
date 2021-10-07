package com.example.foodrg


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.page_2.*

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_2)

        button5.setOnClickListener { startActivity(Intent(this, page3::class.java)) }

        button4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://akshay-10000.github.io/college-project/foodRecepie.html"))
            startActivity(intent)

    }


    }
}