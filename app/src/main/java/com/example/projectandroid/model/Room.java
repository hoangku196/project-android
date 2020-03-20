package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "rooms",
        foreignKeys = {@ForeignKey(entity = KindOfRoom.class,
                parentColumns = "kindOfRoom_id",
                childColumns = "kindOfRoom_id",
                onUpdate = ForeignKey.CASCADE, onDelete = ForeignKey.SET_NULL)
        }
)
public class Room {

    @PrimaryKey
    @ColumnInfo(name = "room_id")
    private String id;

    private int kindOfRoom_id;

    private String describe;

    @Ignore
    private KindOfRoom kindOfRoom;

    public Room(String id, String describe, KindOfRoom kindOfRoom) {
        this.id = id;
        this.describe = describe;
        this.kindOfRoom = kindOfRoom;
        this.kindOfRoom_id = kindOfRoom.getId();
    }

    public String getId() {
        return id;
    }

    public int getKindOfRoom_id() {
        return kindOfRoom_id;
    }

    public String getDescribe() {
        return describe;
    }
}
