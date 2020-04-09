package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "user"
)
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idUser")
    private String id;

    private String password;
    private String fullName;
    private String position;

    public User(String id, String password, String fullName, String position) {
        this.id = id;
        this.password = password;
        this.fullName = fullName;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }
}
