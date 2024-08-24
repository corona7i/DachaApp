package com.example.dachaapp

import android.os.Bundle
import androidx.activity.ComponentActivity

class MakeField : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val width = intent.getIntExtra("width", 0)
        val length = intent.getIntExtra("length", 0)

    }


}