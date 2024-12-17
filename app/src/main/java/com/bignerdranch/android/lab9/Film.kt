package com.bignerdranch.android.lab9

import java.time.LocalDate
import java.util.Date
import java.util.UUID

data class Film (val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var watched: Boolean = false)