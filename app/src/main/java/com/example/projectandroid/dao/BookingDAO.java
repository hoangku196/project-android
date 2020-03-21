package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.projectandroid.model.Booking;
import com.example.projectandroid.model.relation.BookingWithClient;
import com.example.projectandroid.model.relation.BookingWithRoom;

import java.util.List;

@Dao
public interface BookingDAO {
    @Insert
    void insertBooking(Booking... bookings);

    @Update
    void updateBooking(Booking... bookings);

    @Delete
    void deleteBooking(Booking... bookings);

    @Query("SELECT * FROM booking")
    List<Booking> getAllBooking();

    @Transaction
    @Query("SELECT * FROM ROOMS")
    List<BookingWithRoom> getRoomWithBooking();

    @Transaction
    @Query("SELECT * FROM CLIENTS")
    List<BookingWithClient> getClientWithBooking();

}
