package com.mahmoudcode.exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatesExercise {

    public static void exercise1(){
        System.out.print("Today's date and time: ");

        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Date: " + currentDate.format(dateFormater) + " Time: " + currentTime.format(dateTimeFormater));
    }

    public static void exercise2(int day, int month, int year){

        LocalDate dateOfBirth =  LocalDate.of(year, month, day);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date of birth: " + dateOfBirth.format(dateFormatter));
    }

    public static void exercise3(int day, int month, int year){
        LocalDate dateOfBirth =  LocalDate.of(year, month, day);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate newDate = dateOfBirth.plusDays(100);

        System.out.println("Adding 100 days to your birth date " + "\n" + newDate.format(dateFormatter));

    }

    public static int exercise4(LocalDate date){

        if(date == null) return 0;

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        Period period = Period.between(date, currentDate);

        System.out.println("Your date of birth is " + date.format(dateFormatter));
        System.out.println("Calculating your age...");
        System.out.print("Your age is ");

        return period.getYears();
    }
}
