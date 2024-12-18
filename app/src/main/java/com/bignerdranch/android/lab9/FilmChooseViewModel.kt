package com.bignerdranch.android.lab9

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class FilmChooseViewModel: ViewModel() {
    val filmLiveData: LiveData<List<Film>> = OmdbFetcher().fetchContents()
}