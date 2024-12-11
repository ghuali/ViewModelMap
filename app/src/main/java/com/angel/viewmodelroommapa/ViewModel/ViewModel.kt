package com.angel.viewmodelroommapa.ViewModel

import androidx.lifecycle.ViewModel
import com.angel.viewmodelroommapa.data.MarcadorDao
import com.angel.viewmodelroommapa.data.MarcadorWithTipo

import kotlinx.coroutines.flow.Flow

class MarcadorViewModel(private val marcadorDao: MarcadorDao) : ViewModel() {

    val marcadoresWithTipo: Flow<List<MarcadorWithTipo>> =
        marcadorDao.getAllMarcadoresAndTipos()
}
