package com.example.foodrg

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.page_2.*
import kotlinx.android.synthetic.main.page_3.*

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_3)

        button6.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://akshay-10000.github.io/college-project/welcomeToKitchenGarden.html"))
            startActivity(intent)
        }






    }

}
