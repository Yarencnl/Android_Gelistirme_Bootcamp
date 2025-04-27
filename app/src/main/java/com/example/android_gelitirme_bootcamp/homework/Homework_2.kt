package com.example.android_gelitirme_bootcamp.homework

fun main(){
    val derece = 35.0
    val fahrenheit = donusum(derece)
    println("$derece derece = $fahrenheit Fahrenheit")
}

fun donusum(derece: Double) : Double{
    return((derece * 1.8) + 32)
}