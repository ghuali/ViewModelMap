package com.angel.viewmodelroommapa.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.angel.viewmodelroommapa.ViewModel.MarcadorViewModel
import com.utsman.osmandcompose.DefaultMapProperties
import com.utsman.osmandcompose.rememberCameraState

import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
import org.osmdroid.tileprovider.tilesource.XYTileSource
import org.osmdroid.util.GeoPoint
import org.osmdroid.util.MapTileIndex

val GoogleSat: OnlineTileSourceBase = object : XYTileSource(
    "Google-Sat",
    0, 19, 256, ".png", arrayOf(
        "https://mt0.google.com",
        "https://mt1.google.com",
        "https://mt2.google.com",
        "https://mt3.google.com"
    )
) { override fun getTileURLString(aTile: Long): String {
        return baseUrl + "/vt/lyrs=s&x=" + MapTileIndex.getX(aTile) + "&y=" + MapTileIndex.getY(
        aTile)
    }
}

@Composable
fun MyMapView(modifier: Modifier = Modifier, viewModel: MarcadorViewModel) {
    val marcadoresWithTipo by viewModel.marcadoresWithTipo.collectAsState(initial = emptyList())

    // define camera state
    val cameraState = rememberCameraState {
        geoPoint = GeoPoint(28.957375205489004, -13.554245657440829)
        zoom = 17.0
    }

    var mapProperties by remember {
        mutableStateOf(DefaultMapProperties)
    }
}
