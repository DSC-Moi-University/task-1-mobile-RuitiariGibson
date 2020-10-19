package com.gibsoncodes.moidscandroid

import android.app.Application
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers

class MoviesViewModel(application: Application):AndroidViewModel(application) {
    private val thumbnail = ResourcesCompat.getDrawable(getApplication<Application>().resources,R.drawable.test_pic_1, null)
    private val listMovies = listOf(Movies("Star wars", thumbnail!!,2.0,34.0),
        Movies("God of war", thumbnail,2.0,34.0))
    val moviesList = liveData(Dispatchers.IO+viewModelScope.coroutineContext){
        emit(listMovies)
    }
}