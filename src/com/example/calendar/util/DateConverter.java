package com.example.calendar.util;

public class DateConverter {

    // Returns the number of days in a specific month and year
    public static int daysInMonths(int year, int month) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1; // Invalid input
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    // February: 29 if leap year, otherwise 28
                    return MathUtils.isLeapYear(year) ? 29 : 28;
                default:
                    return -1; // Just in case, though shouldn't reach here
            }
        }
    }

    // Returns total number of days in a given year (365 or 366)
    public static int daysInYear(int year) {
        return MathUtils.isLeapYear(year) ? 366 : 365;
    }

    // Converts a specific date (day/month/year) to the day number of the year
    public static int converterToDays(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12
                || day < 1 || day > daysInMonths(year, month)) {
            return -1; // Invalid input
        }

        int totalDays = 0;

        // Add up all the days from previous months
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonths(year, i);
        }

        totalDays += day; // Add current day
        return totalDays;
    }

    // Converts a given day number of the year back to a full date (month/day/year)
    public static String convertToDate(int dayOfYear, int year) {
        if (dayOfYear < 1 || dayOfYear > daysInYear(year) || year < 1 || year > 9999) {
            return "Invalid date"; // Input validation
        }

        // Subtract days of each month until reaching the correct one
        for (int month = 1; month <= 12; month++) {
            int daysInMonth = daysInMonths(year, month);
            if (dayOfYear <= daysInMonth) {
                return month + "/" + dayOfYear + "/" + year;
            }
            dayOfYear -= daysInMonth;
        }

        return "Invalid date"; // Fallback, should never be reached
    }
}
