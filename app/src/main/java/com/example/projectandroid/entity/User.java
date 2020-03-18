package com.example.projectandroid.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class User{

    @PrimaryKey
    @ColumnInfo(name = "user_id")
    private String id;

    @ColumnInfo(name = "user_name")
    private String name;

    @ColumnInfo(name = "user_password")
    private String password;

    @ColumnInfo(name = "user_fullName")
    private String fullName;

}
