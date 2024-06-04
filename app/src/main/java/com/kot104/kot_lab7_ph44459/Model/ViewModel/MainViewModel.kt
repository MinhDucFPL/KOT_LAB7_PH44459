package com.kot104.kot_lab7_ph44459.Model.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kot104.kot_lab7_ph44459.Model.entities.Movie

class MainViewModel: ViewModel() {
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies
    init {
        _movies.value = Movie.getSampleMovies()
    }
}