package com.training.first;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DataUtilsDemo {

    public static void main1(String[] args) throws ParseException {

        Date today = new Date();
        System.out.println("java.util.Date: " + today);

        java.sql.Date sqlDate = new java.sql.Date(today.getTime());
        System.out.println("java.sql.Date: " + sqlDate);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Formatted yyyy-MM-dd: " + sdf1.format(today));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted dd-MM-yyyy HH:mm:ss: " + sdf2.format(today));

        String strDate = "15-08-2025";
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy");
        Date parsedDate = sdf3.parse(strDate);
        System.out.println("Parsed Date: " + parsedDate);

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Date after 5 days: " + cal.getTime());

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("ZonedDateTime: " + zonedDateTime);

        // DateTimeFormatter examples
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Formatted LocalDateTime: " + localDateTime.format(dtf1));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        System.out.println("Formatted LocalDate: " + localDate.format(dtf2));
        
        
    }
    
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2003,12,17,12,10,40);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy-MMMM-dd hh:mm:sec a");
        System.out.println("Time now: " + ldt.format(dtf1));
    } 
}
