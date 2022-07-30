/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bellevuecsd320.bailey.module10averagearray;

public class BaileyModule10Revised {
   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*
    James Bailey CSD320 Module 12
    
    Revision of Module_10(Added required program description comment block)
    Works Cited:
    https://github.com/mlnorman/Intro-To-Java-Programming/blob/master/Chp7/Exercise_07_08.java
    https://www.javacodegeeks.com/2020/10/java-program-to-calculate-average-using-arrays.html#:~:text=First%2C%20create%20an%20array%20with,get%20the%20average%20of%20numbers.
    https://gist.github.com/gitaficionado/cbfad90584f9eb5c091fae699d459316
    https://stackoverflow.com/questions/6834037/initialize-a-long-in-java
    https://www.javatpoint.com/method-overriding-in-java
    https://www.javacodegeeks.com/2020/10/java-program-to-calculate-average-using-arrays.html#:~:text=First%2C%20create%20an%20array%20with,get%20the%20average%20of%20numbers.
    https://www.javatpoint.com/generics-in-java
*/
/*
 *  THIS PROGRAM WILL TAKE TEN VALUES
 *  OF ANY NUMBER TYPE AND FIND THE 
 *  AVERAGE OF THE NUMBER USING 
 *  AN OVERLOADED METHOD.
 *
 */
    public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("Please enter ten numerical values of any type: ");
        
        for (int i = 0; i < 10; i++) 
            vals[i] = in.nextDouble();
    
        System.out.printf("The average is: %.2f", average(vals));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int vals : array)
            sum += vals;
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = (long) 0L;
        for (long vals : array) 
            sum += vals;
        return sum / array.length;
    }
    
    public static short average(short[] array) {
        short sum = 0;
        for (short vals : array) 
            sum += vals;
        return (short) (sum / array.length);
    }
    
    public static double average(double[] array) {
        double sum = 0.0;
        for (double vals : array) 
            sum += vals;
        return sum / array.length;
    }

}
