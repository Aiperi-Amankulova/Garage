package com.example.garage.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatImageView
import com.example.garage.utils.AnimationUtils

class AnimatedPressImageView(context: Context, attributeSet: AttributeSet) :
    AppCompatImageView(context, attributeSet) {

    init {
        isClickable = true
        isFocusable = true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                AnimationUtils.animatePress(this)
            }
            MotionEvent.ACTION_UP -> {
                AnimationUtils.animateRelease(this)
            }
        }

        return super.onTouchEvent(event)
    }
}