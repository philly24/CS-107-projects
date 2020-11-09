import java.util.Scanner;
/*
8.50 LAB 10e: Remove spaces - methods
this takes in a user sentence and returns the sentence without any of the whitespace.  
CS107-(Section 4)
Date 11/1/2020
@author  Phillip Vo
*/
public class RemoveSpaces {
	
	
	public static String removeSpaces(String userString) {
		String isSpaceless = userString.replaceAll("\\s+", "");
		System.out.println(isSpaceless);
		return isSpaceless;
	}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String userInput;
	userInput = scan.nextLine();
	removeSpaces(userInput);
	}
}
