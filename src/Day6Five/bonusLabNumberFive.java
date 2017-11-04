package Day6Five;

import java.util.Random;
import java.util.Scanner;

public class bonusLabNumberFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";

		// Import Random
		Random rand = new Random();
		int randomNumber = rand.nextInt(100); // declare the random number

		int userGuess;
		int numberOfTries = 0; // keep track of user guesses

		// Continue to loop until the win variable is true
		boolean win = false;

		// Prompt input from the user.
		System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("Enter your guess:");

		while (win == false) {
			userGuess = scan1.nextInt();
			numberOfTries++;

			if (userGuess == randomNumber) {
				win = true;

			}else if (userGuess > randomNumber + 10) {
				 System.out.println("WAY too high!"); //
				 //guessAgain(scan1);
				 System.out.println("Would you like to guess again?"); choice =
				 scan1.nextLine(); scan1.nextLine();
				 System.out.println("Enter your number again");
				
				
			}else if (userGuess <= randomNumber + 10 && userGuess >= randomNumber + 5) {
					 System.out.println("Close, but still to high!"); //
					 //guessAgain(scan1);
					 System.out.println("Would you like to guess again?"); choice =
					 scan1.nextLine(); scan1.nextLine();
					 System.out.println("Enter your number again");
					  
				
				
			} else if (userGuess < randomNumber + 5 && userGuess >= randomNumber +1) {
				System.out.println("Almost but too high!");
				// guessAgain(scan1);

				System.out.println("Would you like to guess again?");
				choice = scan1.nextLine();
				scan1.nextLine();
				System.out.println("Enter your number again");

			} else if (userGuess <= randomNumber - 1 && userGuess >= randomNumber - 5) {
				System.out.println("Almost but too low!");
				// guessAgain(scan1);
				System.out.println("Would you like to guess again?");
				choice = scan1.nextLine();
				
				scan1.nextLine();
				System.out.println("Please enter another number");

			}
			
			 else if (userGuess < randomNumber - 5 && userGuess >= randomNumber - 10) { System.out.println(
			 " You're still too low.");
			 //guessAgain(scan1);
			 System.out.println("Would you like to guess again?"); choice =
			 scan1.nextLine(); scan1.nextLine();
			 System.out.println("Please enter another number"); }
			 

		 else if (userGuess < randomNumber - 10) { System.out.println(
		 " WAY too low.");
		 //guessAgain(scan1);
		 System.out.println("Would you like to guess again?"); choice =
		 scan1.nextLine(); scan1.nextLine();
		 System.out.println("Please enter another number"); }

			
			

		}
		System.out.println("You got it!");
		System.out.println("The number was " + randomNumber);
		System.out.println("It took you: " + numberOfTries + " tries");

		// System.out.println("Would you like to play again?");
		// choice = scan1.nextLine();
		// scan1.nextLine();

	}

	/*
	 * public static void guessAgain(Scanner scan1) { String choice;
	 * System.out.println("Would you like to guess again?"); choice =
	 * scan1.nextLine(); scan1.nextLine(); }
	 */
}
