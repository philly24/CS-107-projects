import java.util.Scanner;
/*
8.53 LAB 11c: Output values below an amount
takes in user values and determined if it is below a certain value;
CS107-(Section 4)
Date 11/9/2020
@author  Phillip Vo
*/

public class arryBelow {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] userValues = new int[20];
		int[] valuesSize;
		int userLength;
		int indexValues;
		int maxValue;
		userLength = scan.nextInt();

		for (int i = 0; i < userLength; i++) {
			indexValues = scan.nextInt();
			userValues[i] = indexValues;
		}
		maxValue = scan.nextInt();
		for (int i = 0; i < userLength; i++) {
			if (userValues[i] < maxValue) {
				System.out.print(userValues[i] + " ");
			}
		}

	}
}
