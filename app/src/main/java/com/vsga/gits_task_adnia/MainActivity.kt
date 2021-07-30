package com.vsga.gits_task_adnia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.regex.Pattern.compile

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailRegex = compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                    "\\@" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "\\.id" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        val editText = findViewById<EditText>(R.id.input_email)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val textView = findViewById<TextView>(R.id.textView_Result)

        fun resultMatcher(email:String):Boolean{
            return emailRegex.matcher(email).matches()
        }

        buttonSubmit.setOnClickListener(View.OnClickListener {
            val email = editText.text.toString()
            val emailMatcher = resultMatcher(email)
            if (emailMatcher==true){
                textView.text = ("Your Email is Valid")
            }else{
                textView.text = ("Your Email is Invalid")
            }

        })
    }
}