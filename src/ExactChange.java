import java.util.Scanner;

/*
8.19 LAB 5a: Exact change
the the user inputs a int number and the program sorts it into exact change using American currency 
CS107-(Section 4)
Date 9/25/20
 @author  Phillip Vo
*/
public class ExactChange {
	static int quarter = 0;
	static int dime = 0;
	static int nickel = 0;
	static int penny = 0;
	static int dollar = 0;

	static int change(int num) {
		if (num >= 100) {
			num -= 100;
			dollar += 1;
			return change(num);
		}
		if (num >= 25) {
			num -= 25;
			quarter += 1;
			return change(num);
		} else if (num >= 10) {
			num -= 10;
			dime += 1;
			return change(num);
		} else if (num >= 5) {
			num -= 5;
			nickel += 1;
			return change(num);
		} else if (num >= 1) {
			num -= 1;
			penny += 1;
			return change(num);
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput;
		userInput = scan.nextInt();
		change(userInput);
		if (userInput == 0) {
			System.out.println("No change");
		}
		if (dollar == 1) {
			System.out.println(dollar + " Dollar");
		}
		if (dollar > 1) {
			System.out.println(dollar + " Dollars");
		}
		if (quarter == 1) {
			System.out.println(quarter + " Quarter");
		}
		if (quarter > 1) {
			System.out.println(quarter + " Quarters");
		}
		if (dime == 1) {
			System.out.println(dime + " Dime");
		}
		if (dime > 1) {
			System.out.println(dime + " Dimes");
		}
		if (nickel == 1) {
			System.out.println(nickel + " Nickel");
		}
		if (nickel > 1) {
			System.out.println(nickel + " Nickels");
		}
		if (penny == 1) {
			System.out.println(penny + " Penny");
		}
		if (penny > 1) {
			System.out.println(penny + " Pennys");
		}

	}
}

/*
 * Write a program with total change amount in pennies as an integer input, and
 * output the change using the fewest coins, one coin type per line. The coin
 * types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and
 * plural coin names as appropriate, like 1 Penny vs. 2 Pennies.
 * 
 * Ex: If the input is:
 * 
 * 0 the output is:
 * 
 * No change Ex: If the input is:
 * 
 * 45 the output is:
 * 
 * 1 Quarter 2 Dimes
 * 
 * 
 */