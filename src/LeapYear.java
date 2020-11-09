import java.util.Scanner;
/*
8.43 LAB 9c: Leap year - methods
Takes in a year and determines if it is a leap year.
CS107-(Section 4)
Date 11/1/2020
@author  Phillip Vo
*/
public class LeapYear {
	public static boolean isLeapYear(int userYear) {
		boolean isLeap;
		if (userYear % 4 == 0 && userYear % 100 != 0) {
			isLeap = true;
			System.out.println(userYear + " is a leap year.");
		}
		else if(userYear % 4 == 0 && userYear % 100 == 0 && userYear % 400 == 0) {
			isLeap = true;
			System.out.println(userYear + " is a leap year.");
		}
		else {
			isLeap = false;
			System.out.println(userYear + " is not a leap year.");
		}
	
		return isLeap;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Year;
		Year = scan.nextInt();
		isLeapYear(Year);
		
	}
}
