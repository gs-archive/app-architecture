package com.gulsah.apparchitecture

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    //sadece viewmodel değiştirebilir, bu aynı zamanda state
    private var counter = 0



    fun onClickMeButton(){
        counter++
    }
    //view'da hiçbir şey olmaması gerektiği için counter ı string e dönüştürüp mainActivity'ye veriyoruz
    fun counter() = counter.toString()


}