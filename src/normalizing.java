import java.util.Scanner;
/*
8.54 LAB 11d: Adjust list by normalizing
takes in user input values and subtracts the min value from each index value.
CS107-(Section 4)
Date 11/9/2020
@author  Phillip Vo
*/

public class normalizing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int indexAmount;
		int indexValue;
		indexAmount = scan.nextInt();
		int[] userInput = new int[indexAmount];
		for (int i = 0; i < userInput.length; i++) {
			indexValue = scan.nextInt();
			userInput[i] = indexValue;
		}
		int min = userInput[0];
		for (int i = 0; i < userInput.length; i++) {
			if(userInput[i] < min) {
				min = userInput[i];
			}
		}
		for (int i = 0; i < userInput.length; i++) {
			userInput[i] -= min;
			System.out.print(userInput[i] + " ");
		}
	}
}
