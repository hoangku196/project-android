package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.User;

import java.util.List;

@Dao
public interface UserDAO {

    @Insert
    void insertUsers(User... user);

    @Update
    void updateUsers(User... users);

    @Delete
    void deleteUsers(User... users);

    @Query("SELECT * FROM USERS")
    List<User> getAllUser();
}
