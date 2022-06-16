package com.busrayalcin.kotlinlessons.nesnetabanli1

class Fonksiyonlar {
    //void (geri dönüşü olmayan)
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return (geri dönüşü olan)
    fun selamla2() : String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parametreli
    fun selamla3(isim:String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(sayi1:Int, sayi2:Int) : Int {
        val toplam = sayi1 + sayi2
        return toplam
    }

    //Overloading
    fun carpma(sayi1:Int, sayi2:Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carpma(sayi1:Double, sayi2:Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carpma(sayi1:Int, sayi2:Int, isim:String){
        println("Çarpma : ${sayi1*sayi2} - İşlem yapan : $isim")
    }


}