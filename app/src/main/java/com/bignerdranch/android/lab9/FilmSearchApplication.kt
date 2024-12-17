package com.bignerdranch.android.lab9

import android.app.Application

class FilmSearchApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        FilmRepository.initialize(this)
    }
}