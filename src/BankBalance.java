import java.util.Scanner;
/*
8.40 Lab 8e: BankBalance
This takes a users input compounds the interest for it as long as the while loop condition is met.
CS107-(Section 4)
Date 10/25/2020
@author  Phillip Vo
*/ 
public class BankBalance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double intrestRate = .03;
		double userBalance;
		int yearCounter = 1;
		int Continue = 1;
		System.out.println("Enter initiail bank balance:");
		userBalance = scan.nextInt();

		do {
			userBalance = userBalance + (userBalance * .03);
			System.out.println("After year " + yearCounter + " at 0.03 interest rate, balance is $" + userBalance);
			System.out.println("Do you want to see the balance at the end of another year?");
			System.out.println("Enter 1 for yes or any other number for no:");
			Continue = scan.nextInt();
			yearCounter++;
		} while (Continue == 1);
	}
}
