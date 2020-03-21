package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.KindOfRoomDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.KindOfRoom;

import java.util.List;

public class KindOfRoomRepository {
    private KindOfRoomDAO korDAO;

    public KindOfRoomRepository(Context context) {
        AppDatabase appDatabase = AppDatabase.getInstance(context);
        korDAO = appDatabase.kindOfRoomDAO();
    }

    //Hàm thêm thể loại mới
    public void insert(KindOfRoom kor) {
        new InsertKindAsyncTask(korDAO).execute(kor);
    }

    //Hàm Update Thể loại
    public void update(KindOfRoom kor) {
        new UpdateKindAsyncTask(korDAO).execute(kor);
    }

    //Hàm xóa thể loại
    public void delete(KindOfRoom kor) {
        new DeleteKindOfRoomAsyncTask(korDAO).execute(kor);
    }

    //Hàm lấy ra tất cả các thể loại
    public List<KindOfRoom> getAll() {
        return korDAO.getAllKind();
    }

    private static class InsertKindAsyncTask extends AsyncTask<KindOfRoom, Void, Void> {

        KindOfRoomDAO korDAO;

        InsertKindAsyncTask(KindOfRoomDAO korDAO) {
            this.korDAO = korDAO;
        }

        @Override
        protected Void doInBackground(KindOfRoom... kindOfRooms) {

            korDAO.insertKinds(kindOfRooms);

            return null;
        }
    }

    private static class UpdateKindAsyncTask extends AsyncTask<KindOfRoom, Void, Void> {

        KindOfRoomDAO korDAO;

        UpdateKindAsyncTask(KindOfRoomDAO korDAO) {
            this.korDAO = korDAO;
        }

        @Override
        protected Void doInBackground(KindOfRoom... kindOfRooms) {

            korDAO.updateKinds(kindOfRooms);

            return null;
        }
    }

    private static class DeleteKindOfRoomAsyncTask extends AsyncTask<KindOfRoom, Void, Void> {

        KindOfRoomDAO korDAO;

        DeleteKindOfRoomAsyncTask(KindOfRoomDAO korDAO) {
            this.korDAO = korDAO;
        }

        @Override
        protected Void doInBackground(KindOfRoom... kindOfRooms) {

            korDAO.deleteKinds(kindOfRooms);

            return null;
        }
    }
}
