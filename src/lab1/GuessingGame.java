/* Lab 1: Hello World, Guessing Game & FizzBuzz */
package lab1;

public class GuessingGame {							// Creates the class GuessingGame.
	public static void main(String[] args) {
		int numberToGuess;					// The variable that will store the number to be guessed.
		int guessedNumber;					// The variable that will store the users latest input.
		
		Toolbox myToolbox = new Toolbox(); 			// Creates a toolbox object using Labs1to3.Toolbox.java.

		System.out.println("Welcome to the guessing game!");	// Welcomes the user to the game.

		numberToGuess = myToolbox.getRandomInteger(10);		// Generates a random number to be guessed.
		guessedNumber = myToolbox.readIntegerFromCmd();		// Takes the next integer input and stores it as the users guess.

		if (guessedNumber == numberToGuess) {			// Checks if the numbers match and tells the user so.
			System.out.println("right");
		} else if (numberToGuess > guessedNumber) {		// Checks if the guess is too low and tells the user so.
			System.out.println("too low");
		} else {						// Checks if the guess is too high and tells the user so.
			System.out.println("too high");
		}
	}
}