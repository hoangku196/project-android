package com.example.projectandroid.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.projectandroid.dao.BookingDAO;
import com.example.projectandroid.database.AppDatabase;
import com.example.projectandroid.model.Booking;
import com.example.projectandroid.model.relation.BookingWithClient;
import com.example.projectandroid.model.relation.BookingWithRoom;

import java.util.List;

public class BookingRepository {

    private BookingDAO bookingDAO;

    public BookingRepository(Context context) {
        AppDatabase appDatabase = AppDatabase.getInstance(context);
        this.bookingDAO = appDatabase.bookingDAO();
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

    public List<BookingWithRoom> getBookingWithRoom() {
        return bookingDAO.getRoomWithBooking();
    }

    public List<BookingWithClient> getBookingWithClient() {
        return bookingDAO.getClientWithBooking();
    }

    private static class InsertBookingAsyncTask extends AsyncTask<Booking, Void, Void> {

        BookingDAO bookingDAO;

        InsertBookingAsyncTask(BookingDAO bookingDAO) {
            this.bookingDAO = bookingDAO;
        }

        @Override
        protected Void doInBackground(Booking... bookings) {

            bookingDAO.insertBooking(bookings);

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

            bookingDAO.insertBooking(bookings);

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

            bookingDAO.insertBooking(bookings);

            return null;
        }
    }

}
