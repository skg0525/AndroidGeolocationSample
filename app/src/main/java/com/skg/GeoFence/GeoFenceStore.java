package com.skg.GeoFence;

import com.google.android.gms.location.Geofence;

public class GeoFenceStore {

    private final String mId;
    private final double mLatitude;
    private final double mLongitude;
    private final float mRadius;
    private long mExpirationDuration;
    private int mTransitionType;


    public GeoFenceStore(
            String geofenceId,
            double latitude,
            double longitude,
            float radius,
            long expiration,
            int transition) {
        // Set the instance fields from the constructor

        // An identifier for the geofence
        this.mId = geofenceId;

        // Center of the geofence
        this.mLatitude = latitude;
        this.mLongitude = longitude;

        // Radius of the geofence, in meters
        this.mRadius = radius;

        // Expiration time in milliseconds
        this.mExpirationDuration = expiration;

        // Transition type
        this.mTransitionType = transition;
    }
    // Instance field getters

    /**
     * Get the geofence ID
     *
     * @return A SimpleGeofence ID
     */
    public String getId() {
        return mId;
    }

    /**
     * Get the geofence latitude
     *
     * @return A latitude value
     */
    public double getLatitude() {
        return mLatitude;
    }

    /**
     * Get the geofence longitude
     *
     * @return A longitude value
     */
    public double getLongitude() {
        return mLongitude;
    }

    /**
     * Get the geofence radius
     *
     * @return A radius value
     */
    public float getRadius() {
        return mRadius;
    }

    /**
     * Get the geofence expiration duration
     *
     * @return Expiration duration in milliseconds
     */
    public long getExpirationDuration() {
        return mExpirationDuration;
    }

    /**
     * Get the geofence transition type
     *
     * @return Transition type (see Geofence)
     */
    public int getTransitionType() {
        return mTransitionType;
    }

    /**
     * Creates a Location Services Geofence object from a
     * SimpleGeofence.
     *
     * @return A Geofence object
     */
    public Geofence toGeofence() {
        // Build a new Geofence object
        return new Geofence.Builder()
                .setRequestId(getId())
                .setTransitionTypes(mTransitionType)
                .setCircularRegion(
                        getLatitude(),
                        getLongitude(),
                        getRadius())
                .setExpirationDuration(mExpirationDuration)
                .build();
    }
}