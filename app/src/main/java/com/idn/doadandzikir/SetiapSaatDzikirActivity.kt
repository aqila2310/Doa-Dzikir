package com.idn.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_setiap_saat_dzikir)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}