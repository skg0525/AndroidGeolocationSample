package com.skg.GeoFence;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Shivam on 10/15/15.
 */
public class Location {
    public LatLng latLng;
    public String name;

    public Location(LatLng latlng, String name) {
        this.latLng = latlng;
        this.name = name;
    }

    public LatLng getLatLng() {
        return latLng;
    }


    public String getName() {
        return name;
    }
}
