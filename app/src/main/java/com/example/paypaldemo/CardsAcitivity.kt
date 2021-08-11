package com.example.paypaldemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cards_acitivity.*

class CardsAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards_acitivity)
        supportActionBar!!.hide()
        btnMore1.background = null
        btnMore2.background = null
        btnBack.setOnClickListener{
            startActivity(Intent(this,PayActivity::class.java))
        }
    }
}