/**    James Bailey CSD320 Module2 Energy    */

import java.util.Scanner; // Scanner is in the java.util package Page 37

public class Energy {
// Create the first class Java reads Page 12
  public static void main(String[] args) {
    // Create Scanner object page 37
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter in kg the weight of water Page 37
    System.out.print("Enter in kilograms the amount of water:");
    double waterMass = input.nextDouble();
    
    // Enter initialTemperature of the water in Celsius Page 63
    System.out.print("Enter initial temperature of water in Celsius:");
    double initialTemperature = input.nextDouble();

    // Enter finalTemperature of the water in Celsius Page 63
    System.out.print("Enter final temperature of water in Celsius:");
    double finalTemperature = input.nextDouble();

    // Calculate Q = waterMass(finalTemperature - initialTemperature) * 4184 to find Joules Page 63
    System.out.print("Q = waterMass(finalTemperature - initialTemperature) * 4184 Where Q = ");
    System.out.println(waterMass * finalTemperature - initialTemperature * 4184);
  }
}