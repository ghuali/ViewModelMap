package com.angel.viewmodelroommapa.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface MarcadorDao {

    @Insert
    suspend fun insertMarcador(marcador: Marcador)

@Query("SELECT * FROM MARCADORES")
fun getAllMarcadoresAndTipos(): Flow<List<MarcadorWithTipo>>
}