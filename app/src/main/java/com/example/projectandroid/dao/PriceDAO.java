package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.Price;

import java.util.List;

@Dao
public interface PriceDAO {
    //Thêm Giá
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPrice(Price... prices);

    //Cập nhật Giá
    @Update
    void updatePrice(Price... prices);

    //Xóa Giá
    @Delete
    void deletePrice(Price... prices);

    @Query("SELECT * FROM PRICE")
    List<Price> listPriceInDatabase();
}
