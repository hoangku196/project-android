package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.BookingDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.Booking;

import java.util.List;

public class BookingRepo {
    private BookingDAO bookingDAO;

    public BookingRepo(Context context) {
        AppDatabase database = AppDatabase.getInstance(context);
        bookingDAO = database.bookingDAO();
    }

    public void insert(Booking booking) {
        new InsertBookingAsyncTask(bookingDAO).execute(booking);
    }

    public void update(Booking booking) {
        new UpdateBookingAsyncTask(bookingDAO).execute(booking);
    }

    public void delete(Booking booking) {
        new DeleteBookingAsyncTask(bookingDAO).execute(booking);
    }

    public List<Booking> getAll() {
        return bookingDAO.getAllBooking();
    }

    private static class InsertBookingAsyncTask extends AsyncTask<Booking, Void, Void> {

        BookingDAO bookingDAO;

        InsertBookingAsyncTask(BookingDAO bookingDAO) {
            this.bookingDAO = bookingDAO;
        }


        @Override
        protected Void doInBackground(Booking... bookings) {
            bookingDAO.insertBoooking(bookings);

            return null;
        }
    }

    private static class UpdateBookingAsyncTask extends AsyncTask<Booking, Void, Void> {

        BookingDAO bookingDAO;

        UpdateBookingAsyncTask(BookingDAO bookingDAO) {
            this.bookingDAO = bookingDAO;
        }

        @Override
        protected Void doInBackground(Booking... bookings) {
            bookingDAO.updateBooking(bookings);

            return null;
        }

    }

    private static class DeleteBookingAsyncTask extends AsyncTask<Booking, Void, Void> {

        BookingDAO bookingDAO;

        DeleteBookingAsyncTask(BookingDAO bookingDAO) {
            this.bookingDAO = bookingDAO;
        }

        @Override
        protected Void doInBackground(Booking... bookings) {
            bookingDAO.deleteBooking(bookings);

            return null;
        }

    }
}
