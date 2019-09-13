package edu.unit07;

import java.util.Scanner;

import edu.unit07.util.LeapYear;

// Despliegue un mensaje indicando, si un año ingresado por el usuario (yyyy), es o no bisiesto.
public class Ejercicio04 {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LeapYear leapYear = new LeapYear();

        System.out.print("Ingrese el año: ");
        int year = reader.nextInt();
        
        if (leapYear.isLeapYear(year)) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }


    }
}