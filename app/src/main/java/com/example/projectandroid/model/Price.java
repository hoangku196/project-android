package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class Price {

    //2 Giờ đầu
    @ColumnInfo(name = "price_twoHourFirst")
    private float twoHourFirst;

    //1 Giờ tiếp thoe
    @ColumnInfo(name = "price_oneHour")
    private float oneHour;

    //Giá 1 ngày
    @ColumnInfo(name = "price_oneDay")
    private float oneDay;

    public float getTwoHourFirst() {
        return twoHourFirst;
    }

    public float getOneHour() {
        return oneHour;
    }

    public float getOneDay() {
        return oneDay;
    }

}
