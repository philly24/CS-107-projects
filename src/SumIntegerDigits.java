import java.util.ArrayList;
import java.util.Scanner;

/*
Program # 8.9 LAB 3a: Sum Integer Digits
Extracting individual integers from a whole int and adding the individual int  
CS107-(Section # 4) 
Date 9 September 2020
 @author Phillip Vo
 */
public class SumIntegerDigits {

	public static void main(String[] args) {
		Scanner scrnInput = new Scanner(System.in);
		int divSum;
		int totalSum = 0;
		divSum = scrnInput.nextInt();
		System.out.println("Enter a number between 0 and 1000: ");
		ArrayList<Integer> arrSum = new ArrayList<Integer>();
		while (divSum > 0) {
			arrSum.add(divSum % 10);
			divSum /= 10;
		}
		for (int i = 0; i < arrSum.size(); i++) {
			totalSum = totalSum + arrSum.get(i);
		}
		System.out.println("The sum of the digits is " + totalSum);
	
		Scanner scnr = new Scanner(System.in);
	      int userInput;
	      userInput = scnr.nextInt();
	do{
	System.out.println("Enter a number (<100): ");
	}while(userInput < 100);
	   System.out.println("Enter a number (<100): ");

	     
	      System.out.println("Your number < 100 is: " + userInput);
	   }
	
	
	
	
	}

}
