package com.example.paypaldemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pay.*

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)
        supportActionBar!!.hide()
        btnBack.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        layoutCard.setOnClickListener{
            startActivity(Intent(this,CardsAcitivity::class.java))
        }
    }
}