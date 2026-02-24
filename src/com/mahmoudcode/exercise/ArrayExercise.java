package com.mahmoudcode.exercise;

import java.util.Arrays;

public class ArrayExercise {

    public static void exercise_1(){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
//        exercise5(arr);
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
        exercise14();
        exercise15();
    }

    /* Exercise 1 */
    // declare an empty integer array of length = 3
    // print the contents to the c)onsole
    private static void exercise1(){
        System.out.println("\nDeclare an empty integer array of length = 3");
        int[] arr = new int[3];
        System.out.println("arr = " + Arrays.toString(arr));
    }

    /* Exercise 2 */
    // fill it with the number `4`
    // print the array to the console
    private static void exercise2(){
        int[] arr = new int[3];
        Arrays.fill(arr, 4);
        System.out.println("\nFill it with the number `4`");
        System.out.println("arr = " + Arrays.toString(arr));
    }

    /* Exercise 3 */
    // reassign the second value in the array to the number `17`
    // print the array to the console
    private static void exercise3(){
        int[] arr = new int[3];
        arr[1] = 17;
        System.out.println("\nReassign the second value in the array to the number `17`");
        System.out.println(Arrays.toString(arr));
    }

    /* Exercise 4 */
    // What happens when you try to re-assign index 5 to any integer?
    private static void exercise4(){
        int[] numbers = {1,2,3,4,5};
        System.out.println("\nWhat happens when you try to re-assign index 5 to any integer?");
        System.out.println(Arrays.toString(numbers) + " Throws an unchecked exception 'ArrayIndexOutOfBoundException");
//        numbers[5] = 6;
    }

    /* Exercise 5 */
    // declare and initialize a String array which holds the values "a", "b", "c" and "d"
    // print the array to the console
    public static void exercise5(String[] letters){
        System.out.println("\ndeclare and initialize a String array which holds the values ");
//        char[] letters ={'a', 'b', 'c', 'd'};
        System.out.println("Original Array");
        for(int i = 0; i < letters.length; i++){
            System.out.println("Letter at index " + i + " is " + letters[i]);
        }
    }

    /* Exercise 6 */
    // using your answer from Q5 above, create a second array which is initialized using your original array
    // hint: instead of using the `new` keyword, try simply giving the name of your original array
    // change the value at index 0 of the new array to "z"
    // print both of your arrays and compare
    private static void exercise6(){
        char[] letters = {'a', 'b', 'c', 'd'};
        letters[0] = 'z';
        System.out.println("\nUsing your answer from Q5 above, create a second array which is initialized using your original array");

        System.out.println("New Array");
        for(int i = 0; i < letters.length; i++){
            System.out.println("Letter at index " + i + " is " + letters[i]);
        }
    }

    /* Exercise 7 */
    // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
    // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
    // change the value at index 0 of the new array to "z"
    // print both of the arrays and compare
    private static void exercise7(){
        char[] letters = {'a', 'b', 'c', 'd'};
        char[] letters3 = Arrays.copyOf(letters, letters.length);
        letters3[0] = 'z';

        System.out.println("\nUsing your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)");
        System.out.println("Original Array");
        for(int i = 0; i < letters.length ;i++){
            System.out.println("Letter at index " + i + " is " + letters[i]);
        }

        System.out.println("New Array");
        for(int i = 0; i < letters3.length ;i++){
            System.out.println("Letter at index " + i + " is " + letters3[i]);
        }
    }

    /* Exercise 8 */
    // create a for loop which goes from 0 to 10
    // print each value
    private static void exercise8(){
        System.out.println("\nCreate a for loop which goes from 0 to 10");
        for(int i = 0; i <= 10; i++){
            System.out.println("Number " + i);
        }
    }

    /* Exercise 9 */
    // create a for loop which goes from 10 down to 0
    // print each value
    private static void exercise9(){
        System.out.println("\ncreate a for loop which goes from 10 down to 0");
        for(int i = 10; i >= 0; i--){
            System.out.println("Number " + i);
        }
    }

    /* Exercise 10 */
    // Create a loop that adds all numbers 0-10 to an array then prints the array
    private static void exercise10(){
        System.out.println("\nCreate a loop that adds all numbers 0-10 to an array then prints the array");
        int[] nums = new int[11];
        for(int i = 0; i <= 10; i++){
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
    }

    /* Exercise 11 */
    // Create a loop that adds all numbers 0-10 to an array then prints the array
    private static void exercise11(){
        System.out.println("\nCreate a loop that adds to a sum");
        int[] numsToAdd = {1, 2, 3, 4};
        System.out.println("Numbers to add " + Arrays.toString(numsToAdd));
        int sum = 0;
        for(int i : numsToAdd){
            sum += i;
        }
        System.out.println("Total: " + sum);
    }

    /* Exercise 12 */
    // create a for loop which goes through each string in our array
    // make each word uppercase
    // assign the value in the array to the uppercase string
    // print our resulting array
    private static void exercise12(){
        System.out.println("\ncreate a for loop which make each word uppercase");

        String[] wordToUpperCase = {"i", "sure", "do", "love", "bees"};
        System.out.println("Original array " + Arrays.toString(wordToUpperCase));
        for(int i = 0; i < wordToUpperCase.length; i++){
            wordToUpperCase[i] = wordToUpperCase[i].toUpperCase();
        }

        System.out.println("Upper case: ");
        for(String word : wordToUpperCase){
            System.out.println(word);
        }
    }

    /* Exercise 13 */
    // Create a loop that capitalises each word in an array, prints the new array
    private static void exercise13(){
        System.out.println("\nCreate a loop that capitalises each word in an array, prints the new array");

        String[] wordToCapitalise = {"i", "sure", "do", "love", "bees"};
        System.out.println("Original Array: " + Arrays.toString(wordToCapitalise));
        for(int i = 0; i < wordToCapitalise.length; i++){
            wordToCapitalise[i] = wordToCapitalise[i].substring(0, 1).toUpperCase() + wordToCapitalise[i].substring(1);
        }

        System.out.println("Capitalised: ");
        for(String word : wordToCapitalise){
            System.out.println(word);
        }
    }

    /* Exercise 14 */
    // Write a program that reverses an array of Strings
    private static void exercise14(){
        System.out.println("\nWrite a program that reverses an array of Strings");
        String[] content = {"you", "are", "how", "hello"};
        StringBuilder reversedStr = new StringBuilder();
        System.out.println("Original Array: " + Arrays.toString(content));

        for(int i = content.length - 1; i >= 0; i--){
            reversedStr.append(content[i]).append(" ");
        }

        System.out.println("Reversed String Output : " + reversedStr + "?");
    }

    /* Exercise 15 */
    // Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".
    private static void exercise15(){
        System.out.println("\nWrite a program that adds total amount for this string \"0.90, 1.00, 9.00, 8.78, 0.01\"");
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";

        String[] inputArr = input.split(", ");
        double total = 0.0;

        for(int i = 0; i < inputArr.length; i++){
            total += Double.parseDouble(inputArr[i]);
        }

        System.out.println("Total is " + total);
    }

}
