package edu.unit07;

import java.util.Scanner;

import edu.unit07.util.LeapYear;

// Determine a partir de una fecha introducida por el teclado con el formato DÍA, MES, AÑO, 
// cual el la fecha del día siguiente.
public class Ejercicio03 {

    public int getMaximumDay(int month, int year) {
        LeapYear leapYear = new LeapYear();
        int maxDay = 0;
        switch (month) {
            case 2:
                if (leapYear.isLeapYear(year)) {
                    maxDay = 29;   
                } else {
                    maxDay = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
        }
        return maxDay;
    }

    public String nextDate(int day, int month, int year) {
        if (day < getMaximumDay(month, year)) {
            day++;
        } else if (day == getMaximumDay(month, year)) {
            day = 1;
            if (month == 12) {
                month = 1; 
                year++;
            } else {
                month++;
            }
        }
        return day + "/" + month + "/" + year;
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // System.out.print("Ingrese la fecha en formato: DIA, MES, AÑO: ");
        // String data = reader.nextLine();

        // String s[] = data.split(",");
        // int day = Integer.valueOf(s[0]);
        // int month = Integer.valueOf(s[1]);
        // int year = Integer.valueOf(s[2]);

        Ejercicio03 ejercicio03 = new Ejercicio03();
        // ejercicio03.calcularSiguienteFecha(day, month, year);
        
        System.out.println();
        System.out.println(ejercicio03.nextDate(1, 1, 2019));
        System.out.println(ejercicio03.nextDate(31, 1, 2019));
        System.out.println(ejercicio03.nextDate(28, 2, 2019));
        System.out.println(ejercicio03.nextDate(31, 12, 2019));
        System.out.println(ejercicio03.nextDate(28, 2, 2000));
        System.out.println(ejercicio03.nextDate(28, 2, 2020));
        System.out.println(ejercicio03.nextDate(28, 2, 2019));

        reader.close();        
    }
}