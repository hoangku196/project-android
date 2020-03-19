package com.example.projectandroid.model.relationships;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.projectandroid.model.KindOfRoom;
import com.example.projectandroid.model.Room;

import java.util.List;

public class RoomWithKindOfRoom {
    @Embedded
    private KindOfRoom kindOfRoom;

    @Relation(
            parentColumn = "kindsOfRoom_id",
            entityColumn = "kindOfRoom_id"
    )
    private List<Room> rooms;
}
