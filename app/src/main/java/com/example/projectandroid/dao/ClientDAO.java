package com.example.projectandroid.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectandroid.model.Client;

import java.util.List;

@Dao
public interface ClientDAO {

    @Insert
    void insertClient(Client... clients);

    @Update
    void updateClient(Client... clients);

    @Delete
    void deleteClient(Client... clients);

    @Query("SELECT * FROM CLIENT")
    List<Client> getAllClient();

}
