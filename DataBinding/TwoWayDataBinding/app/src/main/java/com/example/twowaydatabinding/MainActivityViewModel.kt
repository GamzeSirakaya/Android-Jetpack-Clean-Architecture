package com.example.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val inputName=MutableLiveData<String>()
    init {
        inputName.value="Gamze"
    }

}