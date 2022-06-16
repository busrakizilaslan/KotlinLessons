package com.busrayalcin.kotlinlessons.nesnetabanli1

fun main() {
    //Nesne oluşturma

    val yas = 10
    val bmw = Araba("Beyaz",0,false)

    //Okuma işlemi

    bmw.bilgiAl()

    //Veri atama

    bmw.renk = "Siyah"
    bmw.hiz = 50
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(30)
    bmw.bilgiAl()

    val sahin = Araba("Kırmızı",100,true)

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()

}