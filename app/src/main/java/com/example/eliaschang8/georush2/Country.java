package com.example.eliaschang8.georush2;

/**
 * Created by eliaschang8 on 3/30/17.
 */


public class Country {
    private double lat,lon;
    private String name;

    public Country(double lat, double lon, String name){
        this.lat = lat;
        this.lon = lon;
        this.name = name;
    }

    private double getLat(){
        return this.lat;
    }

    private double getLon(){
        return  this.lon;
    }

    private String getName(){
        return this.name;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setName(String name) {
        this.name = name;
    }
}
