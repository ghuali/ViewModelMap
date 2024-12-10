package com.angel.viewmodelroommapa.data

import androidx.room.Embedded
import androidx.room.Relation
import kotlinx.coroutines.flow.Flow

data class MarcadorWithTipo(
    @Embedded val marcador: Marcador,
    @Relation(
        parentColumn = "idTipoMarcadorOwner",
        entityColumn = "idTipoMarcador"
    )
    val tiposMarcadores: List<TipoMarcador>
)