package codsoft;

import java.util.*;

public class ATMmachine {

	BankAccount account = new BankAccount();
	private static Scanner sc = new Scanner(System.in);

	// function to set up account details
	public void initializeAccountDetails() {

		System.out.println("Enter Account details:");
		System.out.println("Enter username");

		String username = sc.nextLine();
		account.setUserName(username);

		System.out.println("Enter mobileNumber");
		long mobileNumber = sc.nextLong();
		account.setMobileNumber(mobileNumber);

		System.out.println("Enter accountNumber");
		long accountNumber = sc.nextLong();
		account.setAccountNumber(accountNumber);
        
		System.out.println("Enter Email id");
		sc.nextLine();
		String email = sc.nextLine();
		account.setEmail(email);
		
		System.out.println("Enter accountBalance");
		double balance = sc.nextDouble();
		account.setBalance(balance);


	}

	public void displayBalance() {
		System.out.println("Current Balance is: " + account.getBalance());
	}

	public void withdraw() {

		System.out.println("Enter amount to be withdrawn");
		double amount = sc.nextDouble();

		double balance = account.getBalance();
		if (balance < amount) {
			System.out.println("Sorry money cannot be withdrawn! Balance is less than the withdrawl amount.");
			return;
		}
		balance -= amount;
		account.setBalance(balance);
		System.out.println("Transaction successfull");
		displayBalance();
	}

	public void deposit() {
		System.out.println("Enter amount to be deposited");
		double amount = sc.nextDouble();
		double balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
		System.out.println("Transaction successfull");
		displayBalance();
	}

	public static void main(String[] args) {
		ATMmachine atm = new ATMmachine();
		atm.initializeAccountDetails();
		int choice = 0;

		do {
			System.out.println("Options:");
			System.out.println("Press 1 for withdrawing money");
			System.out.println("Press 2 for depositing money");
			System.out.println("Press 3 for checking account balance");
			System.out.println("Press 0 for exit");
			choice = sc.nextInt();

			switch (choice) {

			case 0:
				break;
			case 1:
				atm.withdraw();
				break;
			case 2:
				atm.deposit();
				break;
			case 3:
				atm.displayBalance();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 0);

	}

}
