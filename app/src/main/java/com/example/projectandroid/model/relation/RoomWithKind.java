package com.example.projectandroid.model.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.projectandroid.model.KindOfRoom;
import com.example.projectandroid.model.Room;

import java.util.List;

//Mối quan hệ giữa room và thể loại của room
public class RoomWithKind {
    @Embedded
    public KindOfRoom kind;

    @Relation(
            parentColumn = "kindOfRoom_id",
            entityColumn = "kindOfRoom_id"
    )
    public List<Room> rooms;
}
