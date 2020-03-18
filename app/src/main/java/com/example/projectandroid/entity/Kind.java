package com.example.projectandroid.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "kinds")
public class Kind {

    @PrimaryKey
    @ColumnInfo(name = "kind_id")
    private String id;

    @ColumnInfo(name = "kind_name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
