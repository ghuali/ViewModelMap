package com.angel.viewmodelroommapa.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface
MarcadorDao { @Insert suspend fun insert(marcador: Marcador)
    @Query("SELECT * FROM marcador")
    suspend fun getAllMarcador(): List<marcador>
    @Update
    suspend fun update(task: task)
    @Delete
    suspend fun delete(task: task) }