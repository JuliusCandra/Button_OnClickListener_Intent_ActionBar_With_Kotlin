package com.dev_candra.button

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        object1()
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.title = "Candra Julius Sinaga"
            actionBar.subtitle = "Home"
        }
    }

    @SuppressLint("SetTextI18n")
    private fun object1(){
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn1 = findViewById<Button>(R.id.button1)
        val text1 = findViewById<TextView>(R.id.text1)
        text1.visibility = View.GONE
        // handle click
        btn1.setOnClickListener {
            Toast.makeText(this,"Anda mengklik tombol Candra Julius Sinaga",Toast.LENGTH_SHORT).show()
            text1.text = "Candra Julius Sinaga"
            text1.visibility = View.VISIBLE
        }
        btn2.setOnClickListener {
            startActivity(Intent(this@MainActivity,newActivity::class.java))
            text1.visibility = View.GONE
        }
    }


}
