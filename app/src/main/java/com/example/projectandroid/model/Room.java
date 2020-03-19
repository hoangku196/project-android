package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "rooms")
public class Room {

    @PrimaryKey
    @ColumnInfo(name = "room_id")
    private String id;

    private int kindOfRoom_id;

    @ColumnInfo(name = "room_name")
    private String name;

    private String describe;

    @Ignore
    private KindOfRoom kindOfRoom;

    public Room(String id, String name, String describe, KindOfRoom kindOfRoom) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.kindOfRoom = kindOfRoom;
        this.kindOfRoom_id = kindOfRoom.getKind_id();
    }

    public String getId() {
        return id;
    }

    public int getKindOfRoom_id() {
        return kindOfRoom_id;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public KindOfRoom getKindOfRoom() {
        return kindOfRoom;
    }
}
