package com.example.projectandroid.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.projectandroid.dao.BookingDAO;
import com.example.projectandroid.dao.ClientDAO;
import com.example.projectandroid.dao.InvoiceDAO;
import com.example.projectandroid.dao.KindOfRoomDAO;
import com.example.projectandroid.dao.RoomDAO;
import com.example.projectandroid.dao.UserDAO;
import com.example.projectandroid.model.Booking;
import com.example.projectandroid.model.Client;
import com.example.projectandroid.model.Invoice;
import com.example.projectandroid.model.KindOfRoom;
import com.example.projectandroid.model.Rooms;
import com.example.projectandroid.model.User;

@Database(
        entities = {
                Booking.class, Client.class, Invoice.class, KindOfRoom.class, Rooms.class, User.class
        },
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "ProjectAndroidDB";

    private static AppDatabase instance;

    public abstract UserDAO userDAO();

    public abstract RoomDAO roomDAO();

    public abstract KindOfRoomDAO korDAO();

    public abstract InvoiceDAO invoiceDAO();

    public abstract ClientDAO clientDAO();

    public abstract BookingDAO bookingDAO();

    public static synchronized AppDatabase getInstance(Context context) {

        if (instance == null) {
            instance = androidx.room.Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration().build();
        }

        return instance;
    }
}
