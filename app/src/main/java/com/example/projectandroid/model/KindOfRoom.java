package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "kindsOfRoom",
        indices = {@Index(value = "kind_name", unique = true)}
)
public class KindOfRoom {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "kindOfRoom_id")
    private int id;

    //Tên Thể loại VD : Queen, Single, Double, King ...
    @ColumnInfo(name = "kind_name")
    private String name;

    //Mô tả thể loại
    private String describe;

    //Giá Bao nhiêu
    @Embedded
    private Price price;

    public KindOfRoom(String name, String describe, Price price) {
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public Price getPrice() {
        return price;
    }
}
