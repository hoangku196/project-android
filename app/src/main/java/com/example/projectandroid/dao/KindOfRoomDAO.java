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
    void insertKinds(KindOfRoom... kinds);

    @Update
    void updateKinds(KindOfRoom... kinds);

    @Delete
    void deleteKinds(KindOfRoom... kinds);

    @Query("SELECT * FROM kindsOfRoom")
    List<KindOfRoom> getAllKind();
}
