package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.RoomDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.Room;
import com.example.projectandroid.model.relation.RoomWithKind;

import java.util.List;

public class RoomRepository {
    private RoomDAO roomDAO;

    public RoomRepository(Context context) {
        AppDatabase appDatabase = AppDatabase.getInstance(context);
        roomDAO = appDatabase.roomDAO();
    }

    public void insert(Room room) {
        new InsertRoomAsyncTask(roomDAO).execute(room);
    }

    public void update(Room room) {
        new UpdateRoomAsyncTask(roomDAO).execute(room);
    }

    public void delete(Room room) {
        new DeleteRoomAsyncTask(roomDAO).execute(room);
    }

    public List<RoomWithKind> getAll() {
        return roomDAO.getAllRoom();
    }

    public List<Room> getByName(String kindName) {
        return roomDAO.getRoomByKindName(kindName);
    }

    private static class InsertRoomAsyncTask extends AsyncTask<Room, Void, Void> {

        RoomDAO roomDAO;

        InsertRoomAsyncTask(RoomDAO roomDAO) {
            this.roomDAO = roomDAO;
        }

        @Override
        protected Void doInBackground(Room... rooms) {

            roomDAO.insertRooms(rooms);

            return null;
        }
    }

    private static class UpdateRoomAsyncTask extends AsyncTask<Room, Void, Void> {

        RoomDAO roomDAO;

        UpdateRoomAsyncTask(RoomDAO roomDAO) {
            this.roomDAO = roomDAO;
        }

        @Override
        protected Void doInBackground(Room... rooms) {

            roomDAO.updateRooms(rooms);

            return null;
        }
    }

    private static class DeleteRoomAsyncTask extends AsyncTask<Room, Void, Void> {

        RoomDAO roomDAO;

        DeleteRoomAsyncTask(RoomDAO roomDAO) {
            this.roomDAO = roomDAO;
        }

        @Override
        protected Void doInBackground(Room... rooms) {

            roomDAO.deleteRooms(rooms);

            return null;
        }
    }
}
