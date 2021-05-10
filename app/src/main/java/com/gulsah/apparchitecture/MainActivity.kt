package com.gulsah.apparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)
        val addOneButton : Button = findViewById(R.id.addOneButton)
        val addTenButton : Button = findViewById(R.id.addTenButton)


        viewModel.counterString.observe(this){
            //toString i kaldırdık
            counterText.text = it
        }

        addOneButton.setOnClickListener {
            viewModel.onAddOneButtonClick()
        }
        addTenButton.setOnClickListener {
            viewModel.onAddTenButtonClick()
        }
    }
}