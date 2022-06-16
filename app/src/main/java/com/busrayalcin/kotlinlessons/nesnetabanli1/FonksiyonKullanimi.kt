package com.busrayalcin.kotlinlessons.nesnetabanli1

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen sonuç : $gelenSonuc")

    f.selamla3("Busra")

    val gelenToplam = f.toplama(100,200)
    println("Gelen Toplam : $gelenToplam")

    f.carpma(5,4,"Ece")
}
