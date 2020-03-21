package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.ClientDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.Client;

import java.util.List;

public class ClientRepository {

    private ClientDAO clientDAO;

    public ClientRepository(Context context) {
        AppDatabase appDatabase = AppDatabase.getInstance(context);
        this.clientDAO = appDatabase.clientDAO();
    }

    public void insert(Client client) {
        new InsertClientAsyncTask(clientDAO).execute(client);
    }

    public void update(Client client) {
        new UpdateClientAsyncTask(clientDAO).execute(client);
    }

    public void delete(Client client) {
        new DeleteClientAsyncTask(clientDAO).execute(client);
    }

    public List<Client> getAll() {
        return clientDAO.getAllClients();
    }

    private static class InsertClientAsyncTask extends AsyncTask<Client, Void, Void> {

        ClientDAO clientDAO;

        InsertClientAsyncTask(ClientDAO clientDAO) {
            this.clientDAO = clientDAO;
        }

        @Override
        protected Void doInBackground(Client... clients) {

            clientDAO.insertClients(clients);

            return null;
        }
    }

    private static class UpdateClientAsyncTask extends AsyncTask<Client, Void, Void> {

        ClientDAO clientDAO;

        UpdateClientAsyncTask(ClientDAO clientDAO) {
            this.clientDAO = clientDAO;
        }

        @Override
        protected Void doInBackground(Client... clients) {

            clientDAO.updateClients(clients);

            return null;
        }
    }

    private static class DeleteClientAsyncTask extends AsyncTask<Client, Void, Void> {

        ClientDAO clientDAO;

        DeleteClientAsyncTask(ClientDAO clientDAO) {
            this.clientDAO = clientDAO;
        }

        @Override
        protected Void doInBackground(Client... clients) {

            clientDAO.deleteClient(clients);

            return null;
        }
    }

}
