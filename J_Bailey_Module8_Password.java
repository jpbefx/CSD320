package com.bellevuecsd320.passwordcheck;

import java.util.Scanner;


public class J_Bailey_Module8_Password {
    
    
/**
 * Source code used from 
 *  https://www.w3resource.com/java-exercises/method/java-method-exercise-11.php
 *  and
 *  https://stackoverflow.com/questions/24661486/creating-a-program-that-asks-for-a-password-and-checks-if-its-correct-or-not
 * 
 * James Bailey CSD320Module7 Password.java
 * 
 */

//public class Exercise11 {
    
public static final int PASSWORD_LENGTH = 8;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least one lowercase character \n" +
                "4. A password must contain at least one uppercase character \n" +
                "By Inputting a password You are agreeing to the above 'Terms and Conditions'.:");
        String s = input.nextLine();
                        //password = JBond123
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }
        // Method for checking the conditions of the password
public static boolean is_Valid_Password(String password) {
    Boolean atleastOneUpper = false;
    Boolean atleastOneLower = false;
    Boolean atleastOneDigit = false;
        // Check password is at least 8 characters long
    if (password.length() < 8) { // If its less then 8 characters, its automatically not valid
        return false;
    }
        // for loop to check at least one character is upper case, lower case, and a digit
    for (int i = 0; i < password.length(); i++) { // Lets iterate over only once. Saving time
        if (Character.isUpperCase(password.charAt(i))) {
            atleastOneUpper = true;
        }
        else if (Character.isLowerCase(password.charAt(i))) {
            atleastOneLower = true;
        }
        else if (Character.isDigit(password.charAt(i))) {
            atleastOneDigit = true;
        }
    }

    return (atleastOneUpper && atleastOneLower && atleastOneDigit); // Return true IFF the password is atleast eight characters long, has atleast one upper, lower and digit
}
}

    
