package com.mahmoudcode.exercise.email;

public class EmailValidator {

    public boolean isValidEmail(String email){

        return email != null && email.contains("@");
    }

    /**
     * Exercise 2
     * Now change the your public method to private and try to run. What happens?
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
     * Do the same but this time change your method to have no access modifier
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
