package com.example.dachaapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class SquareView(context: Context) : View(context) {

    private var paint = Paint()
    private var isColored = false

    init {
        paint.style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (isColored) {
            paint.color = Color.RED
        } else {
            paint.color = Color.WHITE
        }
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)
    }

    fun setColor(colored: Boolean) {
        isColored = colored
        invalidate()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE -> {
                setColor(true)
            }
        }
        return true
    }
}