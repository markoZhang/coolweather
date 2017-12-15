package com.example.marko.coolweather.gson;

/**
 * Created by Marko on 2017/12/14.
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
