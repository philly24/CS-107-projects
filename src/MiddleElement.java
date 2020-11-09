import java.util.Scanner;
/*
8.52 LAB 11b: Middle item
takes in a user array and outputs the middle index of the array.
CS107-(Section 4)
Date 11/9/2020
@author  Phillip Vo
*/

public class MiddleElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int indexVal;
		int mid;

		int[] userValues = new int[9];

		int counter = 0;
		do {
			indexVal = scan.nextInt();
			if (counter > 8 && indexVal > 0) {
				System.out.println("Too many inputs");
			}
			if (indexVal > 0) {
				userValues[counter] = indexVal;
				counter++;
			}
			 else {
				break;
			}
		} while (indexVal > 0);
		
		
			int[] arrLength = new int[counter];
			for (int i = 0; i < counter; i++) {
				arrLength[i] = userValues[i];
			}
			mid = arrLength[arrLength.length / 2];
			System.out.println(mid);
		
	}
}