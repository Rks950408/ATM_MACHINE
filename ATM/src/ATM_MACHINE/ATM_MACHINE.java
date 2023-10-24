package ATM_MACHINE;

import java.util.*;

class ATM {
	float Balance;
	int PIN = 2674;

	public void checkpin() {
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if (enteredpin == PIN) {
			menu();
		} else {
			System.out.println("Enter a valid PIN : ");

		}
	}

	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. check your A/C Balance ");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMoney();
		} else if (opt == 3) {
			depositMoney();
		} else if (opt == 4) {
			return;
		} else {
			System.out.println("Enter a valid choice");
		}
	}

	public void checkBalance() {
		System.out.println("Balance : " + Balance);
		menu();
	}

	public void withdrawMoney() {
		System.out.println("Enter amount to Withdraw :");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > Balance) {
			System.out.println("Insufficient Balance");
		} else {
			Balance = Balance - amount;
			System.out.println("Money withdraw sucessfully");
		}
		menu();

	}

	public void depositMoney() {
		System.out.println("Enter the Amount: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited Sucessfully");
		menu();
	}
}

public class ATM_MACHINE {
	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkpin();
	}
}