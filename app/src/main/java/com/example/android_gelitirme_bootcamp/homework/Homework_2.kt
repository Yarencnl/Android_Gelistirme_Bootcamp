package com.example.android_gelitirme_bootcamp.homework



fun main(){

    // 1-Parametre olarak girilen dereceyi fahrenheit'a dönüştüren fonksiyon

    val derece = 35.0
    val fahrenheit = donusum(derece)
    println("$derece derece = $fahrenheit Fahrenheit")


    //2-Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan metod
    val k1 = 18
    val k2 = 43

    val sonuc = (2 * k1) + (2 * k2)
    println("Kenarları $k1 ve $k2 olan dikdörtgenin çevresi: $sonuc")

}

fun donusum(derece: Double) : Double{
    return((derece * 1.8) + 32)
}





