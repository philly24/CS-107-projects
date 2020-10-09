import java.util.Scanner;
/*
8.28 Lab 6e: CharacterOps
This code takes the user name and determines if the first letter is a vowel, consonant or neither.
CS107-(Section 4)
Date 10/4/20
@author Phillip Vo
 */
public class CharacterOps {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String userName;
	char firstLetter;
	System.out.println("Enter your first name: ");
	userName = scan.next();
	System.out.println("Hello, " + userName + "!");
	firstLetter = userName.charAt(0);
	if (userName.toLowerCase().charAt(0) == 'e' || userName.toLowerCase().charAt(0) == 'a' || userName.toLowerCase().charAt(0) == 'i' || userName.toLowerCase().charAt(0) == 'o' || userName.toLowerCase().charAt(0) == 'u') {
		System.out.println("The first letter of your name, '" + userName.charAt(0) + "'," + " is a vowel." );
		} 
	
	else if (Character.isAlphabetic(firstLetter)) {
			System.out.println("The first letter of your name, '" + firstLetter + "'," + " is a consonant.");
		} 
	
	else {
			System.out.println(
					"The first letter of your name, '" + firstLetter + "'," + " is neither a vowel nor a consonant.");
		}
	}
}
