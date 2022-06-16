package com.busrayalcin.kotlinlessons.nesnetabanli1

class Araba(var renk:String, var hiz:Int, var calisiyorMu:Boolean) {

    init { // Constructor
        println("Nesne oluşturuldu")
    }

    fun calistir(){ //Side Effect
        hiz = 5
        calisiyorMu = true
    }

    fun durdur(){
        hiz = 0
        calisiyorMu = false
    }

    fun hizlan(kacKm:Int){

        hiz += kacKm
    }

    fun yavasla(kacKm:Int){
        hiz -= kacKm
    }


    fun bilgiAl(){
        println("*********************************")
        println("Renk : ${renk}")
        println("Hız : ${hiz}")
        println("Çalışıyor mu : ${calisiyorMu}")
    }


}