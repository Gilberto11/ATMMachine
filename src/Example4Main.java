import java.util.Scanner;

public class Example4Main {

	public static void main(String[] args) {
		//creating a program with if statement using as an example an ATM machine
		//create a Scanner Object for input
		
		Scanner input = new Scanner(System.in);
		//declare variables
		double balance = 200.0, amount;
		//ask the user how much they want to withdraw
		System.out.println("Please enter the amount to withdraw");
		//read in the amount from the user
		amount = input.nextDouble();
		//check if the ammount is more than the balance
		if (amount > balance) {
			System.out.println("Amount exceeds available funds");
			System.out.println("Your balance is: " + balance);
		} else {
			balance = balance - amount;
			System.out.println("Processing transaction");
			System.out.println("Your new balance is: " + balance);
			
		    
			
		}

	}

}
