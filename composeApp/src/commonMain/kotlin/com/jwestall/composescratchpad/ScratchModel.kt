package com.jwestall.composescratchpad

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

object ScratchModel {
    var text by mutableStateOf("Hello")
}