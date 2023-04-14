package com.emobilis.jocalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttonCalc:Button
    lateinit var buttonIntent:Button
    lateinit var buttonWeb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalc=findViewById(R.id.Btn_Calc)
        buttonIntent=findViewById(R.id.Btn_Intent)
        buttonWeb=findViewById(R.id.Btn_Web)

        buttonCalc.setOnClickListener {
            val intent= Intent(this,CalculatorActivity::class.java)
            startActivity(intent)

        }
        buttonIntent.setOnClickListener {
            val intent= Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }

        buttonWeb.setOnClickListener {
            val intent= Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
    }
}