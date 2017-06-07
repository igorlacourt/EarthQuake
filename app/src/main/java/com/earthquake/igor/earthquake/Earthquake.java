package com.earthquake.igor.earthquake;

/**
 * Created by igor on 02/06/2017.
 */

public class Earthquake {

    private String mMagnitude, mLocation;
    long mDate;


    public Earthquake(String mMagnitude, String mLocation, long mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }


    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmDate() {
        return mDate;
    }
}
