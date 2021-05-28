package com.example.dam_cl2
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tarea")

data class Tarea (
    @PrimaryKey val nombre:String,
    var terminada:Boolean
)