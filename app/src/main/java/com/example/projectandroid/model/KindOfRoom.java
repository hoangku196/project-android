package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "kindOfRoom")
public class KindOfRoom {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idKOR")
    private String id;

    @ColumnInfo(name = "nameKOR")
    private String name;

    @ColumnInfo(name = "priceKOR")
    private float price;

    @ColumnInfo(name = "des")
    private String describe;

    public KindOfRoom(String name, float price, String describe) {
        this.name = name;
        this.price = price;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescribe() {
        return describe;
    }
}
