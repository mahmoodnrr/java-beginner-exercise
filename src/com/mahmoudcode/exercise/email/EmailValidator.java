package com.mahmoudcode.exercise.email;

public class EmailValidator {

    public boolean isValidEmail(String email){

        return email != null && email.contains("@");
    }

    /**
     * Exercise 2
     * This method is only accessible within this class
     */
//    private boolean isValidEmail(String email){
//
//        if(email != null && email.contains("@")){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

    /**
     * Exercise 3
     * This method is only accessible within this class
     */

//    boolean isValidEmail(String email){
//
//        if(email != null && email.contains("@")){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
}
