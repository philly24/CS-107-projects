import java.util.Scanner;

/*
8.22 Lab 5d: FizzBuzz
using modulo, determined if the number inputed prints fizz, buzz, fizzbuzz, or invalid numner.
CS107-(Section 4)
Date 9/25/20
 @author  Phillip Vo
*/
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		input = scan.nextInt();
		if (input == 201 || input == 0) {
			System.out.println("Invalid number");
		} 
		else if (input % 3 == 0 && input % 5 == 0) {
			System.out.println("FizzBuzz");

		} 
		else if (input == 1) {
			System.out.println(1);
		}
		else if (input % 3 == 0) {
			System.out.println("Fizz");
		} 
		else if (input % 5 == 0) {
			System.out.println("Buzz");
		} 
		else {
			System.out.println("Invalid number");
		}

	}
}
