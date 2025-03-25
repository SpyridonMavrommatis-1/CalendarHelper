package com.example.calendar;

import com.example.calendar.util.DisplayHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu options to the user
        System.out.println("Choose an option:");
        System.out.println("  Convert a date to day of year ");
        System.out.println("  Convert a day of year to date ");
        System.out.println();
        System.out.println("Choose by number: 1 or 2");
        System.out.println();
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();


        // Handle user input using switch-case
        switch (choice) {
            case 1:
                int day = -1, month = -1, year = -1;

                while (true) {
                    try {
                        System.out.print("Enter number of day: ");
                        day = scanner.nextInt();
                        System.out.print("Enter number of month: ");
                        month = scanner.nextInt();
                        System.out.print("Enter year: ");
                        year = scanner.nextInt();
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid input. Please enter numbers only.");
                        scanner.nextLine(); // clear the invalid input
                    }
                }

                DisplayHelper.printDayOfYear(day, month, year);
                break;

            case 2:
                int dayOfYear = -1, year2 = -1;

                while (true) {
                    try {
                        System.out.print("Enter day of year: ");
                        dayOfYear = scanner.nextInt();
                        System.out.print("Enter year: ");
                        year2 = scanner.nextInt();
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid input. Please enter numbers only.");
                        scanner.nextLine(); // clear the invalid input
                    }
                }

                DisplayHelper.printDateFromDayOfYear(dayOfYear, year2);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close(); // Release system resources (In this case, for good practice).
    }
}
