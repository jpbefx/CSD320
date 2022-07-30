package com.bellevuecsd320.bailey.csd320module_9;

/*
 * James Bailey CSD 320 Module 9 Assignment
 * Works Cited 
 * https://javatutoring.com/java-program-calculate-average-numbers/
 * https://www.codegrepper.com/code-examples/java/find+maximum+in+array+java
 */
import java.util.Scanner;



public class BaileyCSD320Module_9 {
/**
 *  James Bailey Module 12...
 *  ...Revision of Module 9 (added required comment block) 
 * 
 * 
 *   THIS PROGRAM WILL TAKE A NUMBER (i) ENTERED BY THE 
 *   USER AND USE IT TO MAKE AN ARRAY.LENGTH(i), 
 *   THEN THE POGRAM WILL TAKE THE NEXT (i) NUMBERS,
 *   FIND THE MINIMUM NUMBER OF THE SEQUENCE,
 *   FIND THE MAXIMUM NUMBER OF THE SEQUENCE,
 *   FIND THE AVERAGE NUMBER OF THE SEQUENCE.
 * 
 */
    
public static void main(String[] args) {
      int n;double res=0;
	
       Scanner sc=new Scanner(System.in);
 
       System.out.println("enter how many numbers to cal  avg");
	   
       n=sc.nextInt();
 
       int a[]=new int[n];
 
       System.out.println("enter   "+n+"  numbers");
 
       // Create a loop to add all of the numbers 
       // entered into an array named 'a'
       for(int i=0;i<n;i++)
	   a[i]=sc.nextInt();
       
       // Create a loop to create a variable to hold all of the numbers in the 
       // array 'a'
       for(int i=0;i<n;i++)
	   res =res+a[i];
       
       //Print the sum of all numbers in the array 'a'
       System.out.println("Sum="+res);  
       //Print the average of all numbers in the array 'a'
       System.out.println("Average="+res/n); 
        //commented out the line below from the source.
        //int[] xr = {2, 4, 1, 3, 7, 5, 6, 10, 8, 9};
        
        
        //Find maximum value
        //Changed the xr variable to the a variable array
        int max = a[0];
        for (int i = 0; i < a.length; i++) 
            if (a[i] > max) 
                max = a[i];
            
        

        //Find minimum value
        int min=a[0];
        for (int i = 0; i <a.length ; i++) 
            if (a[i]<min)
                min=a[i];
    
        //Print the maximum number in the array 'a'
        System.out.println("max: "+max);
        //Print the minimum number in the array 'a'
        System.out.println("min: "+min);
    
    }
}    