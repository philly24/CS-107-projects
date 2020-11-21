import java.util.Scanner;
/*
8.59 LAB 12d: Sort an array
takes in users int and places it in a sorted array
CS107-(Section 4)
Date 11/21/2020
@author  Phillip Vo
*/
public class SortArr {

	public static void sortArray(int[] myArr, int arrSize) {
		for (int i = 0; i < myArr.length - 1; i++) {
			for (int j = 0; j < myArr.length - i - 1; j++) {
				if (myArr[j] > myArr[j + 1]) {
					int temp = myArr[j];
					myArr[j] = myArr[j + 1];
					myArr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("how many arr index");
		Scanner scan = new Scanner(System.in);
		int sizeArr;
		sizeArr = scan.nextInt();
		int[] arr = new int[sizeArr];
		for (int i = 0; i < sizeArr; i++) {
			int indexValue;
			indexValue = scan.nextInt();
			arr[i] = indexValue;
		}
		sortArray(arr, sizeArr);

	}
}
