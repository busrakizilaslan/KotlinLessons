package com.busrayalcin.kotlinlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var str1:String? = null
    lateinit var str2:String

   // lateinit var sayi:Int// Int,Boolean,Double,Float vb. bunlar primitive tiptir ve lateinit kavramı kullanılmaz

    var sayi :Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Merhaba"
    }
}