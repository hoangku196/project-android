package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.Booking;

import java.util.List;

@Dao
public interface BookingDAO {
    @Insert
    void insertBoooking(Booking... bookings);

    @Update
    void updateBooking(Booking... bookings);

    @Delete
    void deleteBooking(Booking... bookings);

    @Query("SELECT * FROM BOOKING")
    List<Booking> getAllBooking();
}
