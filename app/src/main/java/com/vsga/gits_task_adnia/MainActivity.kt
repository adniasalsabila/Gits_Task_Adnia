package com.vsga.gits_task_adnia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.input_number)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val textView = findViewById<TextView>(R.id.textView_Result)

        buttonSubmit.setOnClickListener(View.OnClickListener {
            val number = editText.text.toString().toInt()

            if (number % 3 == 0) {
                textView.text = ("Hello")
                textView.visibility = View.VISIBLE
            }
            if (number % 5 == 0) {
                textView.text = ("World")
                textView.visibility = View.VISIBLE
            }
            if (number % 3 == 0 && number % 5 == 0) {
                textView.text = ("Hello World")
                textView.visibility = View.VISIBLE
            }
            if (number % 3 != 0 && number % 5 != 0) {
                textView.text = ("not divisible by 3 and 5")
                textView.visibility = View.VISIBLE
            }
        })
    }
}