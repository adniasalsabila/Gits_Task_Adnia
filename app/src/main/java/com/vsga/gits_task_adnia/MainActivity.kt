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
            val timeConvert= timeConverter(text)
            textView.text = ("Result $timeConvert")

        })
    }

    fun timeConverter(str: String): String {
        var timeBefore = str.substringBeforeLast(":").toInt()
        val timeAfter = str.substringAfterLast(":").dropLast(3)
        val result = str.substringAfterLast(" ")

        if (result.contains("AM",true) && timeBefore == 12){
            timeBefore-=12
        }
        if (result.contains("PM",true) && timeBefore < 12){
            timeBefore+=12
        }
        return "$timeBefore:$timeAfter"
    }
}