package com.busrayalcin.kotlinlessons.variable

fun main(){
    var urunId:Int = 3416
    var urunAdi: String = "Macbook Pro"
    var urunAdedi: Int = 100
    var urunFiyati:Double = 34.999
    var urunTedarikci:String= "Apple"

    println("Ürün ID: $urunId")
    println("Ürün Adı: $urunAdi")
    println("Ürün Adedi: $urunAdedi")
    println("Ürün Fiyatı: $urunFiyati ₺")
    println("Ürün Tedarikçi: $urunTedarikci")

    var a = 10
    var b = 20
    println("$a x $b = ${a*b}")


    // Constants - Sabitler ( value -deger)   val

    var sayi = 30
    println("$sayi")
    sayi = 40
    println("$sayi")

    val sayi2 = 40
    println("$sayi2")


}