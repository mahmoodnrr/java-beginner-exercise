package com.mahmoudcode;

import com.mahmoudcode.exercise.*;
import com.mahmoudcode.exercise.enums.EngineType;

public class Main {
    public static void main(String[] args){

//        /* Challenge 1 */
//        ArrayExercise.exercise_1();
//        ArrayExercise.exercise5(args);
//
//        /* Challenge 2 */
//        ConditionalsExercise.printExercise();
//
//        /* Challenge 3 */
//        Challenge3.reverseString("Hello");
//        Challenge3.trimSpaces("   amig os cod e  ");
//        Challenge3.longestString(new String[]{"hello", "bingo", "ola", "bye", "ciao"});
//
//        /* Challenge 4 */
//        int num1 = 10;
//        int num2 = 20;
//        Challenge4.sumOfTwoNumbers(num1, num2);
//
//        int negation1 = -5;
//        int negation2 = 10;
//        System.out.println("negation of " + negation1 + " is " +  Challenge4.getNegateNumber(negation1));
//        System.out.println("negation of " + negation2 + " is " +  Challenge4.getNegateNumber(negation2));
//
//        int checkNum1 = 1;
//        int checkNum2 = 2;
//        int checkNum3 = 10;
//        int checkNum4 = 10;
//
//        System.out.println( checkNum1 + " and " + checkNum2 + " are equal: " + Challenge4.isSameNumber(checkNum1, checkNum2));
//        System.out.println( checkNum3 + " and " + checkNum4 + " are equal: " + Challenge4.isSameNumber(checkNum3, checkNum4));
//
//        Challenge4.compareNumbers(checkNum1, checkNum2);
//        Challenge4.compareNumbers(checkNum2, checkNum1);
//        Challenge4.compareNumbers(checkNum3, checkNum4);
//
//        String name = "mahmoud";
//        System.out.println("Capitalising first letter in " + name);
//        System.out.println(Challenge4.getFirstLetter(name));
//
//        String[] str1 = {"foo", "bar", "baz"};
//        String[] str2 = {"foo", "bar"};
//        String[] str3 = {};
//
//        System.out.println("Number of items in " + Arrays.toString(str1) + " is " + Challenge4.getNumberOfItems(str1));
//        System.out.println("Number of items in " + Arrays.toString(str2) + " is " + Challenge4.getNumberOfItems(str2));
//        System.out.println("Number of items in " + Arrays.toString(str3) + " is " + Challenge4.getNumberOfItems(str3));
//
//        String sentence1 = "Hello World!";
//        String sentence2 = "It is raining cats and dogs.";
//
//        int counter = Challenge4.getNumberOfWords(sentence1);
//        System.out.println(sentence1);
//        System.out.println("Total number of words " + counter);
//
//        counter = Challenge4.getNumberOfWords(sentence2);
//        System.out.println(sentence2);
//        System.out.println("Total number of words " + counter);
//
//        /* Challenge 5 */
//        ScannerExercise.exercise1();
//        ScannerExercise.exercise2(args);
//        ScannerExercise.exercise3();
//        ScannerExercise.exercise4();
//
//        /* Challenge 6 */
//        DatesExercise.exercise1();
//        DatesExercise.exercise2(1, 11, 2026);
//        DatesExercise.exercise3(1, 11, 2000);
//        System.out.println(DatesExercise.exercise4(LocalDate.of(1998, 12, 1)));
//
//        /* Challenge 7 */
//        EnumsExercise.printTShirtSizes();
//        EnumsExercise.printTShirtSizesInLowerCase();
//
//        /* Challenge 8 */
//        EmailValidator email = new EmailValidator();
//        String mockEmail1 = "test123@gmail.com";
//        String mockEmail2 = "test123gmail.com";
//
//        System.out.println("Is " + mockEmail1 + " a valid email? " + email.isValidEmail(mockEmail1));
//        System.out.println("Is " + mockEmail2 + " a valid email? " + email.isValidEmail(mockEmail2));

        /* Challenge 9 */
//        HandleExceptionExercise.exercise1(args);
//        HandleExceptionExercise.exercise2();

        /* Challenge 10 */
//        MyFileExercise.printExercise();

        /* Challenge 11 */
        Car car1 = new Car("Kia", 2500.00, EngineType.PETROL);
        Car car2 = new Car("Bmw", 2500.00, EngineType.ELECTRIC);
        Car car3 = new Car("VW", 2500.00, EngineType.HYBRID);
        Car car4 = new Car("Merc", 2500.00, EngineType.DIESEL);
        Car car5 = new Car("Honda", 2500.00, EngineType.DIESEL);

        System.out.println("Car details");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

        System.out.println();

        CarDealership carDealership = new CarDealership("MA", 4);
        carDealership.addCarstoStock(car1);
        carDealership.addCarstoStock(car2);
        carDealership.addCarstoStock(car3);
        carDealership.addCarstoStock(car4);
        carDealership.addCarstoStock(car5);

        System.out.println();
        System.out.println("Dealership");
        System.out.println(carDealership.toString());

        System.out.println();

        carDealership.findCarByManufacturer("car2.getManufacturerName()");
    }
}
