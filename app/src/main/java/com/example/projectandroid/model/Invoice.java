package com.example.projectandroid.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "invoice",
        foreignKeys = {@ForeignKey(
                entity = Booking.class,
                parentColumns = "idBooking",
                childColumns = "idBooking",
                onUpdate = ForeignKey.CASCADE
        )}
)
public class Invoice {

    @PrimaryKey
    private String id;

    private String idBooking;

    private float service;
    private float discount;

    private float total;

    @Ignore
    private Booking booking;

    public Invoice(float service, float discount, float total, Booking booking) {
        this.service = service;
        this.discount = discount;
        this.total = total;
        this.booking = booking;
        this.idBooking = booking.getId();
    }

    public String getId() {
        return id;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public float getService() {
        return service;
    }

    public float getDiscount() {
        return discount;
    }

    public float getTotal() {
        return total;
    }

    public Booking getBooking() {
        return booking;
    }
}
