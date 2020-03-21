package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "users", indices = {@Index(value = {"user_name"}, unique = true)})
public class User {

    //Id của user được tự động tạo ra
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    private int id;

    //User Name không được trùng nhau
    @ColumnInfo(name = "user_name")
    private String name;

    //Password của user
    @ColumnInfo(name = "user_password")
    private String password;

    //Tên đầy đủ của User
    @ColumnInfo(name = "user_fullName")
    private String fullName;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }
}
