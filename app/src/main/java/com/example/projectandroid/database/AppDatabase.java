package com.example.projectandroid.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.projectandroid.dao.BookingDAO;
import com.example.projectandroid.dao.ClientDAO;
import com.example.projectandroid.dao.KindOfRoomDAO;
import com.example.projectandroid.dao.RoomDAO;
import com.example.projectandroid.dao.UserDAO;
import com.example.projectandroid.model.Booking;
import com.example.projectandroid.model.Client;
import com.example.projectandroid.model.KindOfRoom;
import com.example.projectandroid.model.Room;
import com.example.projectandroid.model.User;

@Database(
        entities = {
                User.class, KindOfRoom.class, Client.class, Room.class, Booking.class
        },
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "ProjectAndroidDB";

    private static AppDatabase instance;

    public abstract UserDAO userDAO();

    public abstract KindOfRoomDAO kindOfRoomDAO();

    public abstract ClientDAO clientDAO();

    public abstract RoomDAO roomDAO();

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
