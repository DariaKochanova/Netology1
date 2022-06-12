package com.example.netology1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG: String = "MainActivity"
        Log.d(TAG, "start of onCreate function")

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        var age: Int = 37
        var height: Double = 172.2

        val result: String = "name: $name surname: $surname age: $age height: $height"

        val output: TextView = findViewById(R.id.output)
        output.text = result

        Log.d(TAG, "end of onCreate function")
    }
}

