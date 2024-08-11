package com.jwestall.composescratchpad

fun changeText() {
    if (ScratchModel.text == "Hello") {
        ScratchModel.text = "General Kenobi"
    } else {
        ScratchModel.text = "Hello"
    }
}