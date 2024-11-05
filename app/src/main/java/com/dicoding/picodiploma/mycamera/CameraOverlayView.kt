package com.dicoding.picodiploma.mycamera

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class CameraOverlayView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val borderPaint = Paint().apply {
        color = Color.WHITE
        style = Paint.Style.STROKE
        strokeWidth = 8f
        isAntiAlias = true
    }

    private val cornerRadius = 40f

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val left = width * 0.2f
        val top = height * 0.3f
        val right = width * 0.8f
        val bottom = height * 0.7f

        canvas.drawRoundRect(left, top, right, bottom, cornerRadius, cornerRadius, borderPaint)
    }

    fun getOverlayBounds(): RectF {
        val left = width * 0.2f
        val top = height * 0.3f
        val right = width * 0.8f
        val bottom = height * 0.7f
        return RectF(left, top, right, bottom)
    }
}