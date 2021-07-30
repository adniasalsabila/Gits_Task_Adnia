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
            val textReverse = isReverse(text)
            textView.text = ("Original Text = $text => Reverse Text = $textReverse")

        })
    }

    fun isReverse(str: String): String {
        var i = str.length - 1
        var start: Int
        var end = i + 1
        var result = ""
        while (i >= 0) {
            if (str[i] == ' ') {
                start = i + 1
                while (start != end) result += str[start++]
                result += ' '.toString()
                end = i
            }
            i--
        }
        start = 0
        while (start != end) result += str[start++]
        return result
    }
}