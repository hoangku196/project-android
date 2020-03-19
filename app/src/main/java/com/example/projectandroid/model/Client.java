package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "clients")
public class Client{
    @PrimaryKey
    @ColumnInfo(name = "client_id")
    private String id;

    @ColumnInfo(name = "client_name")
    private String name;

    @ColumnInfo(name = "client_phoneNumber")
    private String phoneNumber;

    @ColumnInfo(name = "client_idCard")
    private String idCard;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }
}
