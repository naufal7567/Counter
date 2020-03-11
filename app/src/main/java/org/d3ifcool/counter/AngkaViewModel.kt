package org.d3ifcool.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AngkaViewModel : ViewModel() {

    private val _score_a = MutableLiveData<Int>()
    val score_a : LiveData<Int>
    get() = _score_a
    init {
        _score_a.value = 0
    }

    fun tambah1A(){
        _score_a.value = _score_a.value?.plus(1)
    }
    fun tambah2A(){
        _score_a.value = _score_a.value?.plus(2)
    }
    fun tambah3A(){
        _score_a.value = _score_a.value?.plus(3)
    }



    private val _score_b = MutableLiveData<Int>()
    val score_b : LiveData<Int>
        get() = _score_b
    init {
        _score_b.value = 0
    }
    fun tambah1B(){
        _score_a.value = _score_a.value?.plus(1)
    }
    fun tambah2B(){
        _score_a.value = _score_a.value?.plus(2)
    }
    fun tambah3B(){
        _score_a.value = _score_a.value?.plus(3)
    }


    fun reset(){
        _score_a.value = 0
        _score_b.value = 0
    }
}