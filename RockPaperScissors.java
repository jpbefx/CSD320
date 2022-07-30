
/**
	James_Bailey_CSD_320-Module3_RockPaperScissors
	main class and structure provided by https://replit.com/@JuniLearning/Rock-Paper-Scissors-blog#Main.java
 */

import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    
		//Get user's move with Scanner input
		Scanner input = new Scanner(System.in);		System.out.println("JamesBailey CSD 320 Module3 Rock, Paper, Scissors.");

		//Use a while(true) loop and only break the loop if the user wants to quit
		while(true) {
		
			//Get the user's move through user input
			System.out.print("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
			String myMove = input.nextLine();
			
			//Check if the user wants to quit the game
			if(myMove.equals("quit")) {
				break;
			}

			//Check if the user's move is valid (rock, paper, or scissors)
			if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

				System.out.println("Your move isn't valid!");
			
			} else {

				//Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
				int rand = (int)(Math.random()*3);
				
				//Convert the random number to a string using conditionals and print the opponent's move 
				// changed if statements to switch statements as shown on Pages 103-104
				String opponentMove = "";
                                opponentMove = switch (rand) {
                                case 0 -> "rock";
                                case 1 -> "paper";
                                default -> "scissors";
                            };
				System.out.println("Opponent move: " + opponentMove);
					
				// Print the results
				// Truth Table explained on Page 96
				if(myMove.equals(opponentMove)) {
					System.out.println("Draw!");
				} else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
					System.out.println("You Win!");
				} else {
					System.out.println("You Lose!");
				}

			}

		}

		//Print a final message for the user
		System.out.println("This concludes our Rock, Paper, Scissors game.");

  }
}