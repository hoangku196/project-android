package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "kindsOfRoom")
public class KindOfRoom {

    @PrimaryKey
    @ColumnInfo(name = "kindOfRoom_id")
    private String id;

    @ColumnInfo
    private int kind_id;

    @ColumnInfo
    private int price_id;

    private String describe;

    @Ignore
    private Price price;

    @Ignore
    private Kind kind;

    public KindOfRoom(String id, String describe, Price price, Kind kind) {
        this.id = id;
        this.describe = describe;
        this.price = price;
        this.kind = kind;
        this.kind_id = kind.getId();
        this.price_id = price.getId();
    }

    public String getId() {
        return id;
    }

    public int getKind_id() {
        return kind_id;
    }

    public int getPrice_id() {
        return price_id;
    }

    public String getDescribe() {
        return describe;
    }

    public Price getPrice() {
        return price;
    }

    public Kind getKind() {
        return kind;
    }
}
