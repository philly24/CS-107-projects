import java.util.Scanner;
/*
8.57 LAB 12b: Swapping variables
takes in 2 int values and swaps the two postions within the array
CS107-(Section 4)
Date 11/9/2020
@author  Phillip Vo
*/
public class SW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[2];
		for(int i = 0; i < 2; i++) {
			num[i] = scan.nextInt();
		}
		swapValues(num);
		
	}
	public static void swapValues(int[] values) {
			int temp;
			temp = values[0];
			values[0] = values[1];
			values[1] = temp;
		
		System.out.print(values[0] + " ");
		System.out.print(values[1]);
		System.out.println();
	}
}
