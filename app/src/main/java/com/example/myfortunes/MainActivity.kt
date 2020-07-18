package com.example.myfortunes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfortunes.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        val yourName = findViewById<EditText>(R.id.yourName)
        val messageName = yourName.text.toString()
        val intent = Intent(this, DisplayFortuneActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, messageName)
        }
        startActivity(intent)
    }
}