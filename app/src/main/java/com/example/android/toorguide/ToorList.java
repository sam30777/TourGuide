package com.example.android.toorguide;

/**
 * Created by Santosh on 06-02-2017.
 */

public class ToorList {
    private String placeName;
    private String placeDescription;
    private int resourceId;

    public ToorList(String x, String y, int z) {
        placeName = x;
        placeDescription = y;
        resourceId = z;
    }

    public String getPlaceName() {
        return placeName;

    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public int getResourceId() {
        return resourceId;
    }
}
