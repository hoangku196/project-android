package com.example.projectandroid.model.converts;

import androidx.room.TypeConverter;

import com.example.projectandroid.constants.Constants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
    private static DateFormat df = new SimpleDateFormat(Constants.DATE_FORMAT);

    @TypeConverter
    public static Date fromTimeStamp(String value) {
        if (value != null) {
            try {
                return df.parse(value);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }

    @TypeConverter
    public static String dateToTimeStamp(Date value) {
        return value == null ? null : df.format(value);
    }

}
