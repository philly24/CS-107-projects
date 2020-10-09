import java.util.Scanner;
/*
8.24 Lab 6a: Phone Number
this program ask the user for a number then returns the area code, exchange and last four didgits as well as returning the number in phone syntax 
CS107-(Section 4)
Date 10/4/20
@author Phillip Vo
 */
public class Lab5c {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 10-digit telephone number:");
	String userInput;
	String areaCode;
	String exchange;
	String lastDigits;
	userInput = scan.next();
	
	if (userInput.length() == 10) {
		System.out.println("You entered " + userInput);
		areaCode = userInput.substring(0,3);
		System.out.println("The area code is " + areaCode);
		
		exchange = userInput.substring(3,6);
		System.out.println("The exchange is " + exchange);
		
		lastDigits = userInput.substring(6);
		System.out.println("The number is " + lastDigits);
		
		System.out.println("The complete telephone number is " + "(" + areaCode + ") " + exchange + "-" + lastDigits);
	}
	else {
		System.out.println("You entered " + userInput);
		System.out.println("Please enter a 10-digit number");
	}
	}
}





/*
The name of the Java class is Lab5c.

The prompt should be on its own line with the following text (i.e. use System.out.println()):

Enter 10-digit telephone number: 
Print the number entered.

Print the area code

Print the exchange

Print the last four numbers

Print the formatted number

Enter 10-digit telephone number: 1234567890
You entered 1234567890
The area code is 123
The exchange is 456
The number is 7890
The complete telephone number is (123) 456-7890


Enter 10-digit telephone number: 123456789
You entered 123456789
Please enter a 10-digit number
*/