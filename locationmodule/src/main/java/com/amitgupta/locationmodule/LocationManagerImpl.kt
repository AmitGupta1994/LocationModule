package com.amitgupta.locationmodule

import android.content.Context

class LocationManagerImpl(context: Context): LocationManager{
    override fun getCurrentLocation(onCurrentLocationFetch: () -> Unit) {
    }
}