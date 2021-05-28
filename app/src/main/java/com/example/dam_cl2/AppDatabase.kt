
package com.example.dam_cl2
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
//@Database(entities = [Tarea], version=1)
abstract class AppDatabase : RoomDatabase(){
        abstract fun tareaDao(): TareaDao
        companion object {
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,

                    AppDatabase::class.java, "database-name"

                ).allowMainThreadQueries().fallbackToDestructiveMigration().build()

            }
            return INSTANCE!!
        }

        }

}