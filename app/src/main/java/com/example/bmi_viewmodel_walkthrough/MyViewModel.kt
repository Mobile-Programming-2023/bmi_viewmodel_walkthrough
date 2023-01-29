package com.example.bmi_viewmodel_walkthrough

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var heightInput by mutableStateOf<String>("")
    var weightInput: String by mutableStateOf<String>("")

    private var height: Float = 0.0f
        get() {
           return heightInput.toFloatOrNull() ?: 0.0f
        }

    private var weight: Int = 0
        get() {
            return weightInput.toIntOrNull() ?: 0
        }

    var bmi: Float = 0.0f
        get() {
            return if (weight > 0 && height > 0) weight / (height * height) else 0.0f
        }

    fun changeHeightInput(value: String) {
        heightInput = value
    }

    fun changeWeightInput(value: String) {
        weightInput = value
    }

}
