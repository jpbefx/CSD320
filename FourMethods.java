/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bellevuecsd320.fourmethods;

/**
 *  JAMES BAILEY CSD310 MODULE8
 * 
 * SOURCES FOR CODE
 * https://www.geeksforgeeks.org/methods-in-java/
 * https://www.w3schools.com/java/java_methods_overloading.asp
 * https://stackoverflow.com/questions/5201576/how-do-i-write-a-method-to-calculate-total-cost-for-all-items-in-an-array
 * https://stackoverflow.com/questions/2448768/why-does-the-program-give-illegal-start-of-type-error
 * https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/#:~:text=DecimalFormat(%E2%80%9C0.00%E2%80%9D),default%20rounding%20mode%20is%20RoundingMode.
 * 
 * 
 */


public class FourMethods {

  public static void main(String[] args) {
       double a;
       double b;
       double c;
       double d;
       double e;
       double f;
       
       a = yearlyService();
       b = yearlyService(9.99);
       c = yearlyService(9.99, -5.99);
       d = yearlyService();
       e = yearlyService(12.99);
       f = yearlyService(12.99, -5.99);
           
      System.out.print("The total for your visit today is " + String.format("%.2f", a) + "\nwith a Tire Rotation: " + String.format("%.2f", b) + 
                            "\nWith a 5.99 discounted coupon: " + String.format("%.2f", c));
      System.out.print("\nThe total for your visit today is " + String.format("%.2f", d) + "\nwith a Tire Rotation: " + String.format("%.2f", e) + 
                            "\nWith a 5.99 discounted coupon: " + String.format("%.2f", f));
      
    }

    public static double yearlyService(){
        double serviceCharge = 19.99;
        return serviceCharge;
}
  public static double yearlyService(double x){
    double serviceCharge = 19.99;
            serviceCharge = serviceCharge + x;
      return  serviceCharge;
}   
  public static double yearlyService(double x, double y){
    double serviceCharge = 19.99;
    serviceCharge = serviceCharge + x + y;
    return serviceCharge;
        }
}