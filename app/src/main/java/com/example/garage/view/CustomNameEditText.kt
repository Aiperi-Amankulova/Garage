package com.example.garage.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class CustomNameEditText(context: Context, attributeSet: AttributeSet) :
    AppCompatEditText(context, attributeSet) {

    init {
    }

    override fun isSuggestionsEnabled(): Boolean {
        return false
    }
}