package com.dannyose.twometics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var firstOperandTextInputLayout: TextInputLayout
    private lateinit var secondOperandTextInputLayout: TextInputLayout
    private lateinit var answerTextView: TextView
    private lateinit var answerButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // connect views
        firstOperandTextInputLayout = findViewById(R.id.operand_1)
        secondOperandTextInputLayout = findViewById(R.id.operand_2)
        answerTextView   = findViewById(R.id.answer_view)
        answerButton = findViewById(R.id.calculate_button)



        answerButton.setOnClickListener{
            val op1:String = firstOperandTextInputLayout.editText?.text.toString()
            val op2:String = secondOperandTextInputLayout.editText?.text.toString()
            answerTextView.text = getString(R.string.answer, op1, op2)

        }
    }

//    private fun getAnswer(){
//
//    }
}