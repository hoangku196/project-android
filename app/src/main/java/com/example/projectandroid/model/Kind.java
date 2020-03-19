package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "kinds")
public class Kind {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "kind_id")
    private int id;

    @ColumnInfo(name = "kind_name")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
