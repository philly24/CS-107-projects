import java.util.Scanner;

/*
8.14 Lab 4a: Mini-MadLib Game with Strings
Replacing words with in a sentence to what the user inputs into the terminal. Uses java scanner to collect user inputs.
CS107-(Section 4)
Date 9/17/20
 @author  Student Name
 */
public class MadLib {
	public static String idString() {
		

		return "MadLib, [Phillip Vo]";
	}

	public static void main(String[] args) {
		/* Your MadLib Code */
		//System.out.println("start");
		idString();
		Scanner scan = new Scanner(System.in);
		String userInput1;
		String userInput2;
		String userInput3;
		String userInput4;
		String userInput5;
		userInput1 = scan.next();
		userInput2 = scan.next();
		userInput3 = scan.next();
		userInput4 = scan.next();
		userInput5 = scan.next();
		System.out.println("O " + userInput1 + ", " + "snare me his " + userInput2 + "!");
		System.out.println("O " + userInput3 + ", catch me his strain!");
		System.out.println("Else moonstruck with " + userInput4 + " and " + userInput5);
		System.out.println("I track him in vain!");
		/* Your Number Guessing Code */
	}
}
//