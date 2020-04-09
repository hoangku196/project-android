package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.KindOfRoom;

import java.util.List;

@Dao
public interface KindOfRoomDAO {
    @Insert
    void insertKORs(KindOfRoom... kindOfRooms);

    @Update
    void updateKORs(KindOfRoom... kindOfRooms);

    @Delete
    void deleteKORs(KindOfRoom... kindOfRooms);

    @Query("SELECT * FROM KINDOFROOM")
    List<KindOfRoom> getAllKindOfRoom();
}
