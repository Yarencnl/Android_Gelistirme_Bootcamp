package com.example.android_gelitirme_bootcamp.homework



fun main() {

    // 1-Parametre olarak girilen dereceyi fahrenheit'a dönüştüren fonksiyon

    val derece = 35.0
    val fahrenheit = donusum(derece)
    println("$derece derece = $fahrenheit Fahrenheit")


    //2-Kenarları girilen ve dikdörtgenin çevresini hesaplayan metod
    val k1 = 18
    val k2 = 43

    val sonuc = (2 * k1) + (2 * k2)
    println("Kenarları $k1 ve $k2 olan dikdörtgenin çevresi: $sonuc")

    //3-Verilen sayının faktöriyel hesabı
    val sayi = 5
    val faktoriyel = faktoriyelHesapla(sayi)
    println("$sayi sayısının faktöriyeli = $faktoriyel")

    //4-Kelime içinde kaç tane 'e' harfi olduğunu bulan metod

    val kelime = "Muvaffakiyetsizleştiricileştiriveremeyebileceklerimizdenmişsinizcesine"
    val eSayisi = eSayisiBulma(kelime)
    println("$kelime kelimesinde $eSayisi tane 'e' harfi vardır." )

}

fun donusum(derece: Double) : Double{
    return((derece * 1.8) + 32)
}

fun faktoriyelHesapla(sayi: Int): Int {
    var sonuc2 = 1
    for (i in 1..sayi) {
        sonuc2 *= i
    }
    return sonuc2
}

fun eSayisiBulma(kelime: String): Int{
    var sayac = 0
    for (harf in kelime){
        if (harf == 'E' || harf == 'e')
            sayac ++
    }
    return sayac
}





