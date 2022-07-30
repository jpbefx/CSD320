/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bellevuecsd320.bailey.module11largestsmallest;


public class BaileyModule11LargestSmallest {
  /**
 *  James Bailey Module 12
 *  revision of Module 11 (Added required comment block program description)
 * 
 *      THIS PROGRAM WILL FIND THE LARGEST AND SMALLET ELEMENTS
 *      WITHIN AN ARRAY USING AN OVERLOADED METHOD.
 */  
    public static void main (String[] args){
        double[][] Array = new double[][] { {5,8} };
        int[][] Array1 = new int[][] { {5,8} };
        
         int[] location = locateLargest(Array);
         int[] location1 = locateLargest1(Array1);
         int[] index = locateSmallest(Array1);
         int[] index1 = locateSmallest1(Array);
        
        System.out.printf("The location of the largest element is (%d, %d)%n",
            location[0], location[1]);
        System.out.printf("The location of the smallest element is (%d, %d)%n",
            location1[0], location1[1]);
        System.out.printf("The location of the largest element is (%d, %d)%n",
            index[0], index[1]);
        System.out.printf("The location of the smallest element is (%d, %d)%n",
            index1[0], index1[1]);
    }
       
   
    public static int[] locateLargest(double[][] arrayParam){
      int[] location = new int[]{0, 0};
        double largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (largest < arrayParam[i][j]) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;   
       
    }
    public static int[] locateSmallest(int[][] arrayParam){
      int[] location1 = new int[]{0, 0};
        double largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (largest < arrayParam[i][j]) {
                    largest = arrayParam[i][j];
                    location1[0] = i;
                    location1[1] = j;
                }
            }
        }
        return location1;  
    }
    
    public static int[] locateSmallest1(double[][] arrayParam){
        
      int[] index1 = {0, 0};
        
        double start = arrayParam[0][0];
        
        for(int i = 0; i < arrayParam.length; i++) {
            
            for(int j = 0; j < arrayParam[i].length; j++) {
                
                if(arrayParam[i][j] < start) {
                    
                    start = arrayParam[i][j];
                    index1[0] = i;
                    index1[1] = j;
                    
                }
                
            }
            
        }
        
       return index1;
    }
    
    public static int[] locateLargest1(int[][] arrayParam){
        
        int[] index = {0, 0};
        
        double start = arrayParam[0][0];
        
        for(int i = 0; i < arrayParam.length; i++) {
            
            for(int j = 0; j < arrayParam[i].length; j++) {
                
                if(arrayParam[i][j] < start) {
                    
                    start = arrayParam[i][j];
                    index[0] = i;
                    index[1] = j;
                    
                }
                
            }
            
        }
        
       return index;
    }
    
   
        
        
} 
  
