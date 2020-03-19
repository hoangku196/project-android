package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "price")
public class Price {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "price_id")
    private int id;

    @ColumnInfo(name = "price_twoHourFirst")
    private float twoHourFirst;

    @ColumnInfo(name = "price_oneHour")
    private float oneHour;

    @ColumnInfo(name = "price_oneDay")
    private float oneDay;

    public int getId() {
        return id;
    }

    public float getTwoHourFirst() {
        return twoHourFirst;
    }

    public void setTwoHourFirst(float twoHourFirst) {
        this.twoHourFirst = twoHourFirst;
    }

    public float getOneHour() {
        return oneHour;
    }

    public void setOneHour(float oneHour) {
        this.oneHour = oneHour;
    }

    public float getOneDay() {
        return oneDay;
    }

    public void setOneDay(float oneDay) {
        this.oneDay = oneDay;
    }
}
