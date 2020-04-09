package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.KindOfRoomDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.KindOfRoom;

import java.util.List;

public class KorRepo {
    private KindOfRoomDAO korDAO;

    public KorRepo(Context context) {
        AppDatabase database = AppDatabase.getInstance(context);
        korDAO = database.korDAO();
    }

    public void insert(KindOfRoom kor) {
        new InsertClientAsyncTask(korDAO).execute(kor);
    }

    public void update(KindOfRoom kor) {
        new UpdateClientAsyncTask(korDAO).execute(kor);
    }

    public void delete(KindOfRoom kor) {
        new DeleteClientAsyncTask(korDAO).execute(kor);
    }

    public List<KindOfRoom> getAll() {
        return korDAO.getAllKindOfRoom();
    }

    private static class InsertClientAsyncTask extends AsyncTask<KindOfRoom, Void, Void> {

        KindOfRoomDAO korDAO;

        InsertClientAsyncTask(KindOfRoomDAO korDAO) {
            this.korDAO = korDAO;
        }


        @Override
        protected Void doInBackground(KindOfRoom... clients) {
            korDAO.insertKORs(clients);

            return null;
        }
    }

    private static class UpdateClientAsyncTask extends AsyncTask<KindOfRoom, Void, Void> {

        KindOfRoomDAO korDAO;

        UpdateClientAsyncTask(KindOfRoomDAO korDAO) {
            this.korDAO = korDAO;
        }

        @Override
        protected Void doInBackground(KindOfRoom... clients) {
            korDAO.updateKORs(clients);

            return null;
        }

    }

    private static class DeleteClientAsyncTask extends AsyncTask<KindOfRoom, Void, Void> {

        KindOfRoomDAO korDAO;

        DeleteClientAsyncTask(KindOfRoomDAO korDAO) {
            this.korDAO = korDAO;
        }

        @Override
        protected Void doInBackground(KindOfRoom... clients) {
            korDAO.deleteKORs(clients);

            return null;
        }

    }
}
