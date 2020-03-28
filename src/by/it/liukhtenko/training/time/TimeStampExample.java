package by.it.liukhtenko.training.time;


import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeStampExample {
    public static void main(String[] args) throws ParseException {
        TimeZone tz = TimeZone.getTimeZone("Europe/Minsk");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//in DB
        dateFormat.setLenient(false);
        dateFormat.setTimeZone(tz);
       // Date moment = dateFormat.parse("2005-03-27 "); // in Bean
        Date moment = dateFormat.parse("2005-03-27 01:30:00"); // in Bean
        System.out.println(moment);
        System.out.println(moment.getTime());
    }
}