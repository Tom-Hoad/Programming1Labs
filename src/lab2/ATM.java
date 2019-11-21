/* Lab 1: Classes, Conditions & Control Statements */
package lab2;

public class ATM {
	Toolbox myToolbox = new Toolbox();		// Creates a toolbox object for ATM.java.
	
	public static void main(String[] args) {		// The main method to create a new ATM.
		ATM myATM = new ATM();			// Instantiates a new ATM object called myATM.
		myATM.go();						// Runs the method go.
	}
	
	public void go() {		// The method to recieve the first balance and handle choices.
		System.out.println("Welcome to online ATM banking");		// Print statements telling the user about the program.
		
		int balance = -1;		// Declares the variable for the balance.
		
		while (balance < 0) {		// Continues ask the user how much is in there account until the balance is positive.
			System.out.println("How much do you want in your account?");
			
			balance = myToolbox.readIntegerFromCmd();		// Reads the next user input from the terminal.
			
			if (balance < 0) {		// Alerts the user that they have entered an invalid amount.
				System.out.println("You cannot start with a negative balance. Try again.");
			}
		}

		while (true) {		// Continues to run until the user quits.
			System.out.println("What do you want to do?");		// Asks the user what they want to do next.
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Inquire");
			System.out.println("4 : Quit");
		
			int choice = myToolbox.readIntegerFromCmd();		// Reads the users choice from the terminal.
			
			if (choice == 1) {		//Runs an if statement based on the users choice that will call a corresponding method.
				balance = withdraw(balance);
			} else if (choice == 2) {
				balance = deposit(balance);
			} else if (choice == 3) {
				inquire(balance);
			} else {
				quit();
			}
		}
	}
	
	public int withdraw(int balance) {		// The method to withdraw money.
		System.out.println("*****************************************");
		System.out.println(" Withdrawal");
		System.out.println("*****************************************");
		
		int withdrawAmount = -1;		// Declares the varaible for withdrawal.
		int newBalance = -1;			// Declares the variable for the new balance.

		while (withdrawAmount < 0 || newBalance < 0) {		// Continues until the withdrawal amount and new balance are positive.
			System.out.println("How much would you like to withdraw?");
		
			withdrawAmount = myToolbox.readIntegerFromCmd();		// Takes the amount that the user would like to withdraw, from the terminal.
			newBalance = balance - withdrawAmount;					// Calculates the new balance.
		
			if (withdrawAmount < 0) {		// Checks if the users is trying to withdraw a negative amount.
				System.out.println("This is an invalid withdrawal amount. Try again.");
			}
			
			if (newBalance < 0) {		// Checks if the user is going into overdraft.
				System.out.println("You cannot withdraw more money than you have in your balance.");
			}
		}
		
		System.out.println("*****************************************");
		System.out.println(" Your new balance is " + newBalance);		// Tells the user their new balance.
		System.out.println("*****************************************");
		
		return newBalance; 		// Returns the new balance.
	}
	
	public int deposit(int balance) {		// The method to deposit money.
		System.out.println("*****************************************");
		System.out.println(" Deposit");
		System.out.println("*****************************************");
		
		int depositAmount = -1;		// Declares the varaible for depositing.

		while (depositAmount < 0) {		// Continues until the deposit amount is positive.
			System.out.println("How much would you like to deposit?");
		
			depositAmount = myToolbox.readIntegerFromCmd();		// Takes the amount that the user would like to deposit, from the terminal.
		
			if (depositAmount < 0) {		// Checks if the users is trying to deposit a negative amount.
				System.out.println("This is an invalid deposit amount. Try again.");
			}
		}
		
		int newBalance = balance + depositAmount;		// Calculates the new balance.
		
		System.out.println("*****************************************");
		System.out.println(" Your new balance is " + newBalance);		// Tells the user their new balance.
		System.out.println("*****************************************");
		
		return newBalance;		// Returns the new balance.
	}
		
	public void inquire(int balance) {		// The method to tell the user their balance.
		System.out.println("*****************************************");
		System.out.println(" Your balance is " + balance);		// Tells the user their balance.
		System.out.println("*****************************************");
	}
	
	public void quit() {		// The method to quit the program.
		System.out.println("*****************************************");
		System.out.println(" Goodbye!");
		System.out.println("*****************************************");

		System.exit(0);		// Ends the program.
	}
}