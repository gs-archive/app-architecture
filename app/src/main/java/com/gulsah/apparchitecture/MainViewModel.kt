package com.gulsah.apparchitecture

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _counter = MutableLiveData<Int>()
    //get olmadan da oluyor!!
    val counter : LiveData<Int> get() = _counter
    init {
        _counter.value = 0
    }

    fun onAddOneButtonClick(){
        _counter.value = _counter.value!!+1
    }
    fun onAddTenButtonClick(){
        _counter.value = _counter.value!!+10
    }




}