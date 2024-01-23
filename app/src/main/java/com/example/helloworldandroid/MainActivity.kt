package com.example.helloworldandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonHelloWorld)
        button.setOnClickListener(){
            val sayHelloWorld = findViewById<TextView>(R.id.helloWorldText)
            sayHelloWorld.text = "Hello World!"
        }
    }
}