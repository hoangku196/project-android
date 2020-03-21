package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.projectandroid.model.Room;
import com.example.projectandroid.model.relation.RoomWithKind;

import java.util.List;

@Dao
public interface RoomDAO {
    @Insert
    void insertRooms(Room... rooms);

    @Update
    void updateRooms(Room... rooms);

    @Delete
    void deleteRooms(Room... rooms);

    @Transaction
    @Query("SELECT * FROM rooms")
    List<RoomWithKind> getAllRoom();

    @Query("SELECT * FROM rooms AS 'R' " +
            "INNER JOIN kindsOfRoom AS 'K' " +
            "ON R.kindOfRoom_id = K.kindOfRoom_id " +
            "WHERE K.kind_name LIKE :kindName")
    List<Room> getRoomByKindName(String kindName);

}
