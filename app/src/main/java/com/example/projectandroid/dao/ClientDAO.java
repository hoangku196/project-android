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
    void insertClients(Client... clients);

    @Update
    void updateClients(Client... clients);

    @Delete
    void deleteClient(Client... clients);

    @Query("SELECT * FROM CLIENTS")
    List<Client> getAllClients();

}
