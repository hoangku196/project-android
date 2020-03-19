package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.Kind;

import java.util.List;

@Dao
public interface KindDAO {
    //Thêm Thể loại
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertKind(Kind... kinds);

    //Cập nhật Thể loại
    @Update
    void updateKind(Kind... kinds);

    //Xóa Thể loại
    @Delete
    void deleteKind(Kind... kinds);

    @Query("SELECT * FROM kinds")
    List<Kind> listKindInDatabase();
}
