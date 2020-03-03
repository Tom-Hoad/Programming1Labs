/* Lab 1: Hello World, Guessing Game & FizzBuzz */
package Y1S1.lab1;

public class FizzBuzz {							// Creates the class FizzBuzz.
	public static void main(String[] args) {
		for (Integer i = new Integer(1); i < 61; i++) {		// Starts a for loop that will go from 1 to 60.
			System.out.println();				// Begins a new line on the output.

			if (i % 3 != 0 && i % 5 != 0){			// Checks if the value i not is a multiple of 5 and not a multiple of 3.
				System.out.print(i);			// Outputs the raw number. because no fizz or buzz.
			}

			if (i % 3 == 0) { 				// Checks if the value i is a multiple of 3.
				System.out.print("Fizz");		// It is a multiple of 3, so it prints "Fizz".
			}

			if (i % 5 == 0) {				// Checks if the value i is a multiple of 5.
				System.out.print("Buzz");		// It is a multiple of 5, so prints "Buzz".
			}
		}
	}
}