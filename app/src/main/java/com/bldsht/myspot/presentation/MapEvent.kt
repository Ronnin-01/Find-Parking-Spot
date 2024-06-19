package com.bldsht.myspot.presentation

import com.bldsht.myspot.domain.model.ParkingSpot
import com.google.android.gms.maps.model.LatLng

sealed class MapEvent{
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()


}