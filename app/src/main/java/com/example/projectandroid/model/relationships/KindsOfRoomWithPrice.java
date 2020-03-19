package com.example.projectandroid.model.relationships;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.projectandroid.model.KindOfRoom;
import com.example.projectandroid.model.Price;

import java.util.List;

public class KindsOfRoomWithPrice {
    @Embedded
    private Price price;

    @Relation(
            parentColumn = "price_id",
            entityColumn = "price_id"
    )
    private List<KindOfRoom> kindOfRooms;
}
