package com.chen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chen_ on 2016-12-07.
 */

public class Forecast {
    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
