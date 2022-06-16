package com.busrayalcin.kotlinlessons.standart_programlama

fun main() {
    //1,2,3
    for (i in 1..3) { // for each
        println("Döngü 1 : $i")
    }

    // 10 ile 20 arasında 5 er artsın
    for (a in 10..20 step 5) { // for each
        println("Döngü 2 : $a")
    }

    //20 ile 10 arasında 5 er azalsın
    for (b in 20 downTo 10 step 5 ) { // for each
        println("Döngü 3 : $b")
    }

    //1 ile 5 arasında çalışan while döngü
    var sayac = 1

    while (sayac < 6){
        println("Döngü 4 :$sayac")
        sayac++
    }

    for (i in 1..5){
        if (i == 3){
            break
        }
        println("Döngü 5 : $i")
    }

    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Döngü 6 : $i")
    }
}