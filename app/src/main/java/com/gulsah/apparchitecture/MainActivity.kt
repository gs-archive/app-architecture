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

        val clickMeButton = findViewById<Button>(R.id.addOneButton)
        val countertext = findViewById<TextView>(R.id.counterText)
        /*ekran döndüğünde counter ölmüyor ama onCreate sırasında da textview'da
        datayı yeniden set etmemiz gerekiyor*/
        countertext.text = viewModel.counter()
        clickMeButton.setOnClickListener {
            viewModel.onClickMeButton()
            countertext.text = viewModel.counter()
        }
    }
}