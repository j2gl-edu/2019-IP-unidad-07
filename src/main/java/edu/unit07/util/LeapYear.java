package edu.unit07.util;

public class LeapYear { 

    public boolean isLeapYear(int year) {
        boolean leap = false;
        
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                leap = true;
            } else if (year % 100 == 0) {
                leap = false;
            } else {
                leap = true;
            }
        }
        return leap;
    }

}