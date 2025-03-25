package com.example.calendar.util;

public class MathUtils {

    /*
     * Checks if a given year is a leap year.
     * Leap years are divisible by 4.
     * However, if divisible by 100, they must also be divisible by 400.
     * Years outside the valid range (1 to 9999) are considered invalid.
     */
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        } else if(year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /*
     * Returns the absolute (positive) value of a number.
     * If the number is negative, returns its opposite.
     */
    public static int abs (int num){
        if (num < 0){
            return -num;
        } else {
            return num;
        }
    }

    /*
     * Returns the maximum of two integers.
     * If both are equal, returns either.
     */
    public static int max(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
