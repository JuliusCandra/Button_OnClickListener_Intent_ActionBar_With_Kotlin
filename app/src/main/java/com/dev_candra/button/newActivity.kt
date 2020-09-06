package com.dev_candra.button

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class newActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_baru)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "Candra Julius Sinaga"
            actionBar.subtitle = "Detail Activity"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }
    /*
    ketika user menekan tombol back button
    maka user akan kembali ke main utama
     */
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}