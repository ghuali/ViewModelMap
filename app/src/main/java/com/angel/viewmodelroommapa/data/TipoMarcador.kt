package com.angel.viewmodelroommapa.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TiposMarcadores")
data class TipoMarcador(
    @PrimaryKey(autoGenerate = true) val idTipoMarcador: Int = 0,
    val tituloTipoMarcador: String
)