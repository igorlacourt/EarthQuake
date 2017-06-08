package com.earthquake.igor.earthquake;

/**
 * Created by igor on 02/06/2017.
 */

public class Earthquake {

    private String mMagnitude, mLocation, url;
    long mDate;


    public Earthquake(String mMagnitude, String mLocation, long mDate, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.url = url;
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

    public String getUrl(){
        return this.url;
    }
}
