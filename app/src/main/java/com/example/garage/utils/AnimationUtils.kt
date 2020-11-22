package com.example.garage.utils

import android.view.View
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.ScaleAnimation

object AnimationUtils {

    private const val DURATION = 80L

    fun animatePress(view: View) {
        val objectAnimation = ScaleAnimation(
            1f,
            0.8f,
            1f,
            0.8f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        objectAnimation.duration = DURATION
        objectAnimation.interpolator = LinearInterpolator()
        objectAnimation.fillAfter = true
        view.startAnimation(objectAnimation)
    }

    fun animateRelease(view: View) {
        val objectAnimation = ScaleAnimation(
            0.8f,
            1f,
            0.8f,
            1f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        objectAnimation.duration = DURATION
        objectAnimation.interpolator = LinearInterpolator()
        objectAnimation.fillAfter = true
        view.startAnimation(objectAnimation)
    }

    fun animateScale(view: View, scaleFrom: Float, scaleTo: Float) {
        val maxScale = 200f
        val minScale = 80f

        val scaleFromFactor = (((maxScale - minScale) / 100f) * scaleFrom + minScale) / 100
        val scaleToFactor = (((maxScale - minScale) / 100f) * scaleTo + minScale) / 100

        val objectAnimation = ScaleAnimation(
            scaleFromFactor,
            scaleToFactor,
            scaleFromFactor,
            scaleToFactor,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        objectAnimation.interpolator = LinearInterpolator()
        objectAnimation.fillAfter = true
        view.startAnimation(objectAnimation)
    }
}