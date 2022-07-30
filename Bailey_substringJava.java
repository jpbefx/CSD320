/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bellevuecsd320.bailey_substring.java;

import java.util.Scanner;

/*
*   James Bailey Module 4 CSD 320 Due: June 12, 2022.
*   
*   THIS PROGRAM WILL TAKE TWO USER ENTERED STRINGS AND COMPARE THEM TO SHOW IF
*   ONE STRING IS THE substring OF THE OTHER STRING AND DISPLAY THE INDEX 
*   AT WHICH THE substring STARTS
*/
public class Bailey_substringJava {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to inter two strings
      System.out.print("Enter two strings. Example: Anything [enter], Anything else [enter].");
      String s1 = input.nextLine();
      String s2 = input.nextLine();
      int ssindex;
      int ssindex1;
      // check to see if the indexOf s2 to s1 is not -1 and print results
    if (s1.contains(s2)){
            // Print from this branch if string1 is a substring of string2
          System.out.println(s2 + " is a substring of " + s1);
            // Create an object to hold value of the index of S1 to S2
        ssindex = s1.indexOf(s2);
            // Also print from this brance the starting index of the substring.
          System.out.println("The index of s2 which starts the substring of s1 is: " + "[" + ssindex + "]");
            // check to see if the indexOf s1 to s2 is not -1 and print results
    }else if (s2.contains(s1)){
          System.out.print(s1 + " is a substring of " + s2);
      // Create an object to hold value of the index of S1 to S2
          ssindex1 = s2.indexOf(s1);
      // Also print from this brance the starting index of the substring.
          System.out.println("The index of s1 which starts the substring of s2 is: " + "[" + ssindex1 + "]");
      // if neither checks are true, neither S1 nor s2 are substrings print results
    }else{
          System.out.print("There are no substring value between " + s1 + " " + s2);
    
    } 
    }
}
