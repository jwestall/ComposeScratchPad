package com.jwestall.composescratchpad

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform