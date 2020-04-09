package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "room",
        foreignKeys = {@ForeignKey(
                entity = KindOfRoom.class,
                parentColumns = "idKOR",
                childColumns = "idKOR"
        )}
)
public class Rooms {

    @PrimaryKey
    @ColumnInfo(name = "idRoom")
    private String id;

    private String idKOR;

    private int floor;

    private String service;

    private String describe;

    @Ignore
    private KindOfRoom kind;

    public Rooms(int floor, String service, String describe, KindOfRoom kind) {
        this.floor = floor;
        this.service = service;
        this.describe = describe;
        this.kind = kind;
        this.idKOR = kind.getId();
    }

    public String getId() {
        return id;
    }

    public String getIdKOR() {
        return idKOR;
    }

    public int getFloor() {
        return floor;
    }

    public String getService() {
        return service;
    }

    public String getDescribe() {
        return describe;
    }

    public KindOfRoom getKind() {
        return kind;
    }
}
