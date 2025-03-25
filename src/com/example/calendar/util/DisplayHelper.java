package com.example.calendar.util;

import com.example.calendar.model.DateConstants;

public class DisplayHelper {

    // Prints the day of the year for a given day, month, and year
    public static void printDayOfYear(int day, int month, int year) {
        int dayOfYear = DateConverter.converterToDays(year, month, day);
        if (dayOfYear == -1) {
            System.out.println("Invalid date.");
        } else {
            String monthName = DateConstants.MONTH_NAMES[month - 1]; // Convert numeric month to name
            System.out.println(day + " " + monthName + " " + year + " is the "
                    + dayOfYear + getOrdinalSuffix(dayOfYear) + " day of the year.");
        }
    }

    // Prints the full date from a given day of the year and year
    public static void printDateFromDayOfYear(int dayOfYear, int year) {
        String result = DateConverter.convertToDate(dayOfYear, year);
        if (result.equals("Invalid date")) {
            System.out.println("Invalid day of year.");
        } else {
            System.out.println("The " + dayOfYear + getOrdinalSuffix(dayOfYear) + " day of "
                    + year + " is " + result + ".");
        }
    }

    // Returns the appropriate ordinal suffix for a number (e.g. 1st, 2nd, 3rd, 4th...)
    private static String getOrdinalSuffix(int number) {
        if (number >= 11 && number <= 13) {
            return "th"; // special case for 11th, 12th, 13th
        }

        switch (number % 10) {
            case 1: return "st"; // 1st, 21st, etc.
            case 2: return "nd"; // 2nd, 22nd, etc.
            case 3: return "rd"; // 3rd, 23rd, etc.
            default: return "th"; // 4th, 5th, ..., 20th, etc.
        }
    }
}
