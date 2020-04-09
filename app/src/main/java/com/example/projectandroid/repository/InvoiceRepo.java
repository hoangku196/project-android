package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.InvoiceDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.Invoice;

import java.util.List;

public class InvoiceRepo {

    private InvoiceDAO invoiceDAO;

    public InvoiceRepo(Context context) {
        AppDatabase database = AppDatabase.getInstance(context);
        invoiceDAO = database.invoiceDAO();
    }

    public void insert(Invoice invoice) {
        new InsertInvoiceAsyncTask(invoiceDAO).execute(invoice);
    }

    public void update(Invoice invoice) {
        new UpdateInvoiceAsyncTask(invoiceDAO).execute(invoice);
    }

    public void delete(Invoice invoice) {
        new DeleteInvoiceAsyncTask(invoiceDAO).execute(invoice);
    }

    public List<Invoice> getAll() {
        return invoiceDAO.getAllInvoice();
    }

    private static class InsertInvoiceAsyncTask extends AsyncTask<Invoice, Void, Void> {

        InvoiceDAO invoiceDAO;

        InsertInvoiceAsyncTask(InvoiceDAO invoiceDAO) {
            this.invoiceDAO = invoiceDAO;
        }


        @Override
        protected Void doInBackground(Invoice... invoices) {
            invoiceDAO.insertInvoice(invoices);

            return null;
        }
    }

    private static class UpdateInvoiceAsyncTask extends AsyncTask<Invoice, Void, Void> {

        InvoiceDAO invoiceDAO;

        UpdateInvoiceAsyncTask(InvoiceDAO invoiceDAO) {
            this.invoiceDAO = invoiceDAO;
        }

        @Override
        protected Void doInBackground(Invoice... invoices) {
            invoiceDAO.updateInvoice(invoices);

            return null;
        }

    }

    private static class DeleteInvoiceAsyncTask extends AsyncTask<Invoice, Void, Void> {

        InvoiceDAO invoiceDAO;

        DeleteInvoiceAsyncTask(InvoiceDAO invoiceDAO) {
            this.invoiceDAO = invoiceDAO;
        }

        @Override
        protected Void doInBackground(Invoice... invoices) {
            invoiceDAO.updateInvoice(invoices);

            return null;
        }

    }

}
