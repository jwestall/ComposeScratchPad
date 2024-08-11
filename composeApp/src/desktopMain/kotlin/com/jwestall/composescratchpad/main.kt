package com.jwestall.composescratchpad

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun appleBar() {
    System.setProperty("apple.laf.useScreenMenuBar", "true")
    System.setProperty("apple.awt.application.appearance", "system")
}

fun main() {
    appleBar()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "ComposeScratchPad",
        ) {
            App()
        }
    }
}