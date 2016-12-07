package com.chen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chen_ on 2016-12-07.
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
