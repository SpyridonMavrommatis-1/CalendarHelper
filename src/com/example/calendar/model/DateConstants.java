package com.example.calendar.model;

public class DateConstants {

/*
A utility class holding constant data for months and days.
This class provides month names and the number of days in each month
(for both regular and leap years).
*/
    public static final String[] MONTH_NAMES = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };


    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
    };


    public static final int[] DAYS_IN_MONTHS_LEAP = {
            31, 29, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
    };
}
