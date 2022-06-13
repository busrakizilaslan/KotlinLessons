package com.busrayalcin.kotlinlessons.variable

fun main() {
    // sayısaldan sayısala

    val i = 42
    val d = 78.95
    val sonuc1 = i.toDouble()
    println(sonuc1)

    val sonuc2 = d.toInt()
    println(sonuc2)

    //sayısaldan metin

    val sonuc3 = i.toString()//"42"
    println(sonuc3)
    val sonuc4 = d.toString()//"78.95"
    println(sonuc4)

    //metinden sayısal değer

    val yazi = "67.54."

    val sonuc5 = yazi.toDoubleOrNull()

    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşümde hata oluştu ve sayınızı kontrol ediniz")
    }

    //if döngüsünde yapılanla aynı işlem yapılır
    sonuc5?.let {
        println(sonuc5)
    }

}