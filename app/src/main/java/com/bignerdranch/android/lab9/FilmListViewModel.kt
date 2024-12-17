package com.bignerdranch.android.lab9

import androidx.lifecycle.ViewModel

// Пока данные генерируются, а не тянутся с базы данных, по этому изменения в этом файле можешь скипнуть.
// Либо можешь сделать, чтоб просто проверить, что все работает как надо
class FilmListViewModel: ViewModel() {
    val films = mutableListOf<Film>()
    init {
        for (i in 0 until 100) {
            val film = Film()
            film.title = "Film #$i"
            film.watched = i % 2 == 0
            films += film
        }
    }
}