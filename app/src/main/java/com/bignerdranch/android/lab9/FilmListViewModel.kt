package com.bignerdranch.android.lab9

import androidx.lifecycle.ViewModel

class FilmListViewModel: ViewModel() {
    private val filmRepository = FilmRepository.get()
    val filmListLiveData = filmRepository.getFilms()
}