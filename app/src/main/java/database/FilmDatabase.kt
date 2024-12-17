package database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.lab9.Film

@Database(entities = [ Film::class ], version=1, exportSchema = false)
@TypeConverters(FilmTypeConverters::class)
abstract class FilmDatabase : RoomDatabase() {

    abstract fun filmDao(): FilmDao

}