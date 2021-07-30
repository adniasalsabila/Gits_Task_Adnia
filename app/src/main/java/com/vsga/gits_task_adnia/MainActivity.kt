package com.vsga.gits_task_adnia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.input_text)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val textView = findViewById<TextView>(R.id.textView_Result)

        buttonSubmit.setOnClickListener(View.OnClickListener {
            val text = editText.text.toString().trim()
            if (isPalindrome(text)) {
                textView.text =("$text is a True Palindrome")
            } else {
                textView.text =("$text is a False Palindrome")
            }
        })
    }

    fun isPalindrome(str: String): Boolean {
        val stringBuilder = StringBuilder(str)

        val reverseStr = stringBuilder.reverse().toString()

        return str.equals(reverseStr, ignoreCase = true)
    }


}