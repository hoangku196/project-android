package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.projectandroid.model.KindOfRoom;
import com.example.projectandroid.model.relationships.KindsOfRoomWithPrice;

import java.util.List;

@Dao
public interface KindsOfRoomDAO {

    //Thêm Thể loại
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertKind(KindOfRoom... kinds);

    //Cập nhật Thể loại
    @Update
    void updateKind(KindOfRoom... kinds);

    //Xóa Thể loại
    @Delete
    void deleteKind(KindOfRoom... kinds);

    @Query("SELECT * FROM kindsOfRoom")
    List<KindOfRoom> listKindInDatabase();

}
