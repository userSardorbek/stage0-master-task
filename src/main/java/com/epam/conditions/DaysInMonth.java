package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean leap;
        if (year % 4 == 0 && year > 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;


        if (month > 0 && month < 13) {

            if (leap && month == 2) {
                System.out.println(29);
                return;
            } else if (!leap && month == 2) {
                System.out.println(28);
                return;
            }

            if ((month <= 7 && month % 2 != 0) || (month >= 8 && month % 2 == 0)) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
