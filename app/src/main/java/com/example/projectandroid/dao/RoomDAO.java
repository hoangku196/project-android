package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.Rooms;

import java.util.List;

@Dao
public interface RoomDAO {
    @Insert
    void insertRoom(Rooms... rooms);

    @Update
    void updateRoom(Rooms... rooms);

    @Delete
    void deleteRoom(Rooms... rooms);

    @Query("SELECT * FROM ROOM")
    List<Rooms> getAllRoom();
}
