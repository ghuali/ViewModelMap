package com.angel.viewmodelroommapa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.angel.viewmodelroommapa.ViewModel.MarcadorViewModel
import com.angel.viewmodelroommapa.ViewModel.ViewModelFactory
import com.angel.viewmodelroommapa.data.AppDatabase
import com.angel.viewmodelroommapa.ui.theme.ViewModelRoomMapaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val database = AppDatabase.getDatabase(this)
        val marcadorDao = database.MarcadorDao()
        enableEdgeToEdge()
        setContent {
            ViewModelRoomMapaTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    val viewModel: MarcadorViewModel = viewModel(factory = ViewModelFactory(marcadorDao))




                    )
                }
            }
        }
    }
}


}