package com.example.projectandroid.model.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.projectandroid.model.Client;
import com.example.projectandroid.model.Room;

import java.util.List;

public class BookingWithClient {

    @Embedded
    private Client client;

    @Relation(
            parentColumn = "client_id",
            entityColumn = "client_id"
    )
    private List<Client> clients;
}
