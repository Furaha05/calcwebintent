package com.emobilis.jocalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var tv_answer:TextView
    lateinit var edt_firstnumber:EditText
    lateinit var edt_secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonsubtract:Button
    lateinit var buttonmultiply:Button
    lateinit var buttondivide:Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        tv_answer = findViewById(R.id.Txt_answer)
        edt_firstnumber = findViewById(R.id.Edt_Fnum)
        edt_secondnumber = findViewById(R.id.Edt_Snum)
        buttonadd = findViewById(R.id.Btn_add)
        buttonsubtract = findViewById(R.id.Btn_subtract)
        buttonmultiply = findViewById(R.id.Btn_multiply)
        buttondivide = findViewById(R.id.Btn_divide)

        buttonadd.setOnClickListener {
            val myfirstnumber=edt_firstnumber.text.toString()
            val mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                tv_answer.text="Please fill all fields"
            }else{
                val answer=myfirstnumber.toDouble() + mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }
        buttonadd.setOnClickListener {
            val myfirstnumber=edt_firstnumber.text.toString()
            val mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                tv_answer.text="Please fill all fields"
            }else{
                val answer=myfirstnumber.toDouble() - mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }
        buttonadd.setOnClickListener {
            val myfirstnumber=edt_firstnumber.text.toString()
            val mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                tv_answer.text="Please fill all fields"
            }else{
                val answer=myfirstnumber.toDouble() / mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }
        buttonadd.setOnClickListener {
            val myfirstnumber=edt_firstnumber.text.toString()
            val mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                tv_answer.text="Please fill all fields"
            }else{
                val answer=myfirstnumber.toDouble() * mysecondnumber.toDouble()
                tv_answer.text=answer.toString()
            }
        }
    }
}