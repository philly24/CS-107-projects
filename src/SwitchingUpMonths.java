import java.util.Scanner;
/*
8.25 Lab 6b Switching Up Months
This code takes in the user input and determines if it matches a month or its abbreviations and returns the month number or 0 for non months
CS107-(Section 4)
Date 10/4/20
@author Phillip Vo
 */
public class SwitchingUpMonths {
	public static void main(String[] args) {
		System.out.println("Enter the month: ");
		Scanner scan = new Scanner(System.in);
		String userInput;
		String userCap;
		userInput = scan.next();
		System.out.println("You entered " + userInput);
		userCap = userInput.substring(0, 3).toUpperCase();
		System.out.println("Its abbreviation is " + userCap);

		switch (userCap) {
		case "JAN":
			System.out.println("This is month number 1");
			break;
		case "FEB":
			System.out.println("This is month number 2");
			break;
		case "MAR":
			System.out.println("This is month number 3");
			break;
		case "APR":
			System.out.println("This is month number 4");
			break;
		case "MAY":
			System.out.println("This is month number 5");
			break;
		case "JUN":
			System.out.println("This is month number 6");
			break;
		case "JUL":
			System.out.println("This is month number 7");
			break;
		case "AUG":
			System.out.println("This is month number 8");
			break;
		case "SEP":
			System.out.println("This is month number 9");
			break;
		case "OCT":
			System.out.println("This is month number 10");
			break;
		case "NOV":
			System.out.println("This is month number 11");
			break;
		case "DEC":
			System.out.println("This is month number 12");
			break;
		
		default:
			System.out.println("This is month number 0");

		}

	}
}