package com.busrayalcin.kotlinlessons.nesnetabanli1

fun main() {
    //Extension
    val sonuc = 5 carpi 2 //5.carpi(2)
    println("Gelen Sonuç : $sonuc")
}

infix fun Int.carpi(sayi:Int) : Int{
    return this * sayi
}

//this = self (Swift)
//