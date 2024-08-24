package com.example.dachaapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import android.widget.GridLayout
import android.graphics.Color;
import com.example.dachaapp.databinding.ActivityMainBinding

import com.example.dachaapp.databinding.ActivityMakeFieldBinding

class MakeField : ComponentActivity() {

    private lateinit var binding: ActivityMakeFieldBinding
    private lateinit var gridLayout: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMakeFieldBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val width_field = intent.getIntExtra("width", 0)
        val length_field = intent.getIntExtra("length", 0)

        val gridLayout = binding.gardenGrid

        val rows = length_field
        val cols = width_field

        val params = android.widget.GridLayout.LayoutParams()

        gridLayout.columnCount = width_field
        gridLayout.rowCount = length_field

        val totalWidth = gridLayout.measuredWidth // Ширина GridLayout после отображения
        val squareSize = totalWidth / width_field      // Размер стороны квадрата

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                val squareView = SquareView(this)

                val params = GridLayout.LayoutParams().apply {
                    width = squareSize  // Растягиваем элемент по ширине
                    height = squareSize  // Растягиваем элемент по высоте
                    rowSpec = GridLayout.spec(i, 1f)
                    columnSpec = GridLayout.spec(j, 1f)
                    setMargins(10, 10, 10, 10) // Опционально: отступы между квадратами
                }
                squareView.layoutParams = params

                // Добавляем SquareView в GridLayout
                gridLayout.addView(squareView)
            }
        }
    }
}