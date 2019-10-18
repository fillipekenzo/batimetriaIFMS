package com.example.batimetriaifms.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aplicativo para receber e enviar dados de batimetria"
    }
    val text: LiveData<String> = _text
}