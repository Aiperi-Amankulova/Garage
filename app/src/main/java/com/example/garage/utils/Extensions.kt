package com.example.garage.utils

import android.widget.SeekBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun startCoroutinesTimer(
    delayMillis: Long,
    repeatCount: Long,
    scope: CoroutineScope,
    action: () -> Unit
) {
    scope.launch {
        delay(delayMillis)
        var position = 0
        if (repeatCount > 0) {
            while (position < repeatCount) {
                action()
                delay(delayMillis)
                position++
            }
            scope.cancel()
        } else {
            action()
        }
    }
}


fun SeekBar.setSeekBarChangeListener(action: (Int) -> Unit) {
    setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
            action(progress)
        }

        override fun onStartTrackingTouch(p0: SeekBar?) {}
        override fun onStopTrackingTouch(p0: SeekBar?) {}
    })
}