/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bellevuecsd320.module_5_jamesbailey;

/**
 *
 * Source code donated in broken condition from 
 * https://www.coursehero.com/tutors-problems/Java-Programming/32078358-a-program-in-java-that-uses-a-while-loop-to-display-the-following-math/
 * 
 * Also used the sample from 
 * https://www.coursehero.com/tutors-problems/Java-Programming/39818941-IN-JAVA-Create-a-program-that-uses-a-while-loop-to-display-the/
 * 
 * Used the syntax clues from the second source to fix the first source.
 */
public class Module_5_JamesBailey {
//Deleted==class Main {
      static void printSeriesAndSum() { //Moved the curly bracket up to this line.
        //start the variable at 0 for the sum of series
        double sumOfSeries = 0.0;
        double sumOfSeries1 = 0.0;

        //while loop to display given series in the smaller to larger
        System.out.println("nnSeries from smaller to larger: n");

        int i = 2;

        //run while loop till 99 to print series
        while(i<=50) {  //Moved the curly bracket up to this line.

          //create the ith term of the series and also to calculate the sum
          sumOfSeries += 1.0/(2 * i - 1);

          //print
          System.out.print("1/"+(2 * i - 1));
          // stop when the denominator reaches 100 or less.
          if(i<50)

            System.out.print(" + ");

          //increment the loop
          i++;
        }

        //print the final
        System.out.println("nSum of series = " +sumOfSeries);

        System.out.println("nnSeries from larger to smaller: n");



        //declare a counter variable to run loop

        int j = 50;

        //While loop till first term to print series

        while(j>=2) { //Moved the curly bracket up to this line.

          //generate the ith term of the series and also calculate sum

          sumOfSeries1 += 1.0/(2 * j - 1);

          //print series

          System.out.print("1/"+(2 * j - 1));

          if(j>2)

            System.out.print(" + ");

          //decrement loop counter

          j--;

        }

     

        // Print the final sum of series

        System.out.println("nSum of series = " +sumOfSeries1);

    }

     

    public static void main (String[] args) { //Moved the curly bracket up to this line.

    //Got rid of the extra curly backets}}

      //call the function
      printSeriesAndSum();
  }
}
