package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.RoomDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.Rooms;

import java.util.List;

public class RoomRepo {

    private RoomDAO roomDAO;

    public RoomRepo(Context context) {
        AppDatabase database = AppDatabase.getInstance(context);
        roomDAO = database.roomDAO();
    }

    public void insert(Rooms room) {
        new InsertUserAsyncTask(roomDAO).execute(room);
    }

    public void update(Rooms room) {
        new UpdateUserAsyncTask(roomDAO).execute(room);
    }

    public void delete(Rooms room) {
        new DeleteUserAsyncTask(roomDAO).execute(room);
    }

    public List<Rooms> getAll() {
        return roomDAO.getAllRoom();
    }

    private static class InsertUserAsyncTask extends AsyncTask<Rooms, Void, Void> {

        RoomDAO roomDAO;

        InsertUserAsyncTask(RoomDAO roomDAO) {
            this.roomDAO = roomDAO;
        }

        @Override
        protected Void doInBackground(Rooms... rooms) {

            roomDAO.insertRoom(rooms);

            return null;
        }

    }

    private static class UpdateUserAsyncTask extends AsyncTask<Rooms, Void, Void> {

        RoomDAO roomDAO;

        UpdateUserAsyncTask(RoomDAO roomDAO) {
            this.roomDAO = roomDAO;
        }

        @Override
        protected Void doInBackground(Rooms... rooms) {
            roomDAO.updateRoom(rooms);

            return null;
        }

    }

    private static class DeleteUserAsyncTask extends AsyncTask<Rooms, Void, Void> {

        RoomDAO roomDAO;

        DeleteUserAsyncTask(RoomDAO roomDAO) {
            this.roomDAO = roomDAO;
        }

        @Override
        protected Void doInBackground(Rooms... rooms) {
            roomDAO.deleteRoom(rooms);

            return null;
        }

    }

}
