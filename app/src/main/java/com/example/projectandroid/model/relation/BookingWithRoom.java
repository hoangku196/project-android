package com.example.projectandroid.model.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.projectandroid.model.Room;

import java.util.List;

public class BookingWithRoom {

    @Embedded
    private Room room;

    @Relation(
            parentColumn = "room_id",
            entityColumn = "room_id"
    )
    private List<Room> rooms;

}
