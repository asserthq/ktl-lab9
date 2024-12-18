package api

import com.bignerdranch.android.lab9.Film
import com.google.gson.annotations.SerializedName

class FilmResponse {
    @SerializedName("Search")
    lateinit var films: List<Film>
}