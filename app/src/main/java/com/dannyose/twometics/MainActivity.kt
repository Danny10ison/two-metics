package com.dannyose.twometics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var answerTextView              : TextView

    private lateinit var firstOperandTextInputLayout : TextInputLayout
    private lateinit var secondOperandTextInputLayout: TextInputLayout

    private lateinit var plusButton                  : Button
    private lateinit var minusButton                 : Button
    private lateinit var timesButton                 : Button
    private lateinit var divideButton                : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // connect views
        firstOperandTextInputLayout = findViewById(R.id.operand_1)
        secondOperandTextInputLayout = findViewById(R.id.operand_2)
        answerTextView   = findViewById(R.id.answer_view)


        plusButton = findViewById(R.id.add_button)
        minusButton = findViewById(R.id.minus_button)
        divideButton = findViewById(R.id.divide_button)
        timesButton = findViewById(R.id.times_button)

        plusButton.setOnClickListener{
            var op1: String = firstOperandTextInputLayout.editText?.text.toString()
            var op2: String = secondOperandTextInputLayout.editText?.text.toString()

            // if op1 is "", set to "0"
            var intOp1 = 0
            var intOp2 = 0
            if(op1 != ""){
                 intOp1 = op1.toInt()
            } else {
                op1 = "0"
                intOp1 = op1.toInt()
            }
            if(op2 != ""){
                intOp2 = op2.toInt()
            } else {
                op2 = "0"
                intOp2 = op2.toInt()
            }

            val sum = intOp1+intOp2
            answerTextView.text = sum.toString()
        }

        minusButton.setOnClickListener{
            var op1: String = firstOperandTextInputLayout.editText?.text.toString()
            var op2: String = secondOperandTextInputLayout.editText?.text.toString()

            // if op1 is "", set to "0"
            var intOp1 = 0
            var intOp2 = 0
            if(op1 != ""){
                intOp1 = op1.toInt()
            } else {
                op1 = "0"
                intOp1 = op1.toInt()
            }
            if(op2 != ""){
                intOp2 = op2.toInt()
            } else {
                op2 = "0"
                intOp2 = op2.toInt()
            }

            val diff = intOp1-intOp2
            answerTextView.text = diff.toString()
        }

        timesButton.setOnClickListener{
            var op1: String = firstOperandTextInputLayout.editText?.text.toString()
            var op2: String = secondOperandTextInputLayout.editText?.text.toString()

            // if op1 is "", set to "0"
            var intOp1 = 0
            var intOp2 = 0
            if(op1 != ""){
                intOp1 = op1.toInt()
            } else {
                op1 = "0"
                intOp1 = op1.toInt()
            }
            if(op2 != ""){
                intOp2 = op2.toInt()
            } else {
                op2 = "0"
                intOp2 = op2.toInt()
            }

            val prod = intOp1*intOp2
            answerTextView.text = prod.toString()
        }

        divideButton.setOnClickListener{
            var op1: String = firstOperandTextInputLayout.editText?.text.toString()
            var op2: String = secondOperandTextInputLayout.editText?.text.toString()

            // if op1 is "", set to "0"
            var intOp1 = 0
            var intOp2 = 0
            if(op1 != ""){
                intOp1 = op1.toInt()
            } else {
                op1 = "0"
                intOp1 = op1.toInt()
            }
            if(op2 != ""){
                intOp2 = op2.toInt()
            } else {
                op2 = "0"
                intOp2 = op2.toInt()
            }

            // division by sero
            if(intOp2==0){
                answerTextView.text = "Can't divide by 0"
            } else{
                val div = intOp1/intOp2
                answerTextView.text = div.toString()
            }
        }
    }
}
