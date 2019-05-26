package com.amitgupta.locationmodule

interface LocationManager {

    fun getCurrentLocation(onCurrentLocationFetch:()->Unit)
}