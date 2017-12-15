package com.example.marko.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Marko on 2017/12/14.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
