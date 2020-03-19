package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.User;

import java.util.List;

@Dao
public interface UserDAO {

    //Thêm User
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUsers(User... users);

    //Cập nhật User
    @Update
    void updateUsers(User... users);

    //Xóa User
    @Delete
    void deleteUsers(User... users);

    //Lấy toàn bộ thông tin user trong database
    @Query("SELECT * FROM USERS")
    List<User> listUserInDatabase();
}
