package com.angel.viewmodelroommapa.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.angel.viewmodelroommapa.data.MarcadorDao
import com.angel.viewmodelroommapa.data.MarcadorWithTipo

import kotlinx.coroutines.flow.Flow

class MarcadorViewModel(private val marcadorDao: MarcadorDao) : ViewModel() {

    val marcadoresWithTipo: Flow<List<MarcadorWithTipo>> =
        marcadorDao.getAllMarcadoresAndTipos()
}

class ViewModelFactory(private val marcadorDao: MarcadorDao) : ViewModelProvider.Factory {
    override fun <A : ViewModel> create(modelClass: Class<A>): A {
        if (modelClass.isAssignableFrom(MarcadorViewModel::class.java)) {
            return MarcadorViewModel(marcadorDao) as A
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
