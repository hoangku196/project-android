package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(
        tableName = "booking",
        foreignKeys = {@ForeignKey(entity = Room.class, parentColumns = "room_id", childColumns = "room_id"),
                @ForeignKey(entity = Client.class, parentColumns = "client_id", childColumns = "client_id", onUpdate = ForeignKey.CASCADE)}
)
public class Booking {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "booking_id")
    private String id;

    private String room_id;

    private String client_id;

    @ColumnInfo(name = "booking_startTime")
    private Date startTime;

    @ColumnInfo(name = "booking_stopTime")
    private Date stopTime;

    @ColumnInfo(name = "booking_price")
    private float price;

    @Ignore
    private Room room;

    @Ignore
    private Client client;

    public Booking(String id, Date startTime, Date stopTime, float price, Room room, Client client) {
        this.id = id;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.price = price;
        this.room = room;
        this.client = client;
        this.client_id = client.getId();
        this.room_id = room.getId();
    }
}
