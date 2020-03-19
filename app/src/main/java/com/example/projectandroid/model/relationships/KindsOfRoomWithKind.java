package com.example.projectandroid.model.relationships;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.projectandroid.model.Kind;
import com.example.projectandroid.model.KindOfRoom;

import java.util.List;

public class KindsOfRoomWithKind {
    @Embedded
    private Kind kind;

    @Relation(
            parentColumn = "kind_id",
            entityColumn = "kind_id"
    )
    private List<KindOfRoom> kindOfRooms;
}
