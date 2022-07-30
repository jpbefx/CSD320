/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bellevuecsd320.practice6;

/** James Bailey CSD320 Module 12
 *  Revised Module 6 
 *  Tried to mimic the original assignment / did not succeed
 *  
 *  THIS PROGRAM CREATES A PYRAMID
 *  USING THE MULTIPLICATION TABLE.
 *
 *  Works Cited: 
 *      https://www.w3schools.com/java/tryjava.asp?filename=demo_data_types
 *      https://www.programiz.com/java-programming/examples/pyramid-pattern
 *     this next link is what I used to quickly play with the code
 *     and run it without faster than NetBeans. Also the dard mode really helps
 *     as well as the three colors theme. Black, Green, White.
 *    https://www.w3schools.com/java/tryjava.asp?filename=demo_data_types
 */
public class NinthAttempt {

  public static void main(String[] args) {
    int rows = 5, k = 1, count = 0, count1 = 1;

    for (int i = 1; i <= rows; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
        ++count;
      }

      while (k != 2 * i) {
        if (count <= rows - 1) {
          System.out.print((i * k) + " ");
          ++count;
        } else {
          ++count1;
          System.out.print((k * i - 1 / count1) + " ");
        }

        ++k;
      }
      count1 = count = k = 1;

      System.out.println();
    }
  }
}