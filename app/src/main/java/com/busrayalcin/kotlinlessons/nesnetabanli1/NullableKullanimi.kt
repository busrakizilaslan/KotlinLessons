package com.busrayalcin.kotlinlessons.nesnetabanli1

fun main() {
    //Nullable = Null Safety = (Swift) Optional
    //null = nil (Swift)

    var str1 = "Merhaba"

    //Tanımlama
    var str2:String? = null

    //Kullanım
    //Yöntem 1:?(str2 null olabilir)
    println("Sonuç 1 :${str2?.trim()}") //trim() = white space boşlukları temizler

    //Yöntem 2:!!(str2 kesinlikle null olmayacağını iddia eder)
    println("Sonuç 2:${str2!!.trim()}")

    //Yöntem 3:
    if (str2 != null){
        println("Sonuç 3 :${str2.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4:
    str2?.let {
        println("Sonuç 4 :${str2.trim()}")
    }


}