
/* OrderStrings2
 * Modify earlier program to pass arrays to methods
 */
import java.util.Scanner;
/*
8.56 Lab 12a: Order3Strings
takes in 3 words and utilizes methods to order and print the order.
CS107-(Section 4)
Date 11/20/2020
@author  Phillip Vo
*/
public class Order3Strings {

	public static void main(String[] args) {
		String[] words = new String[3];
		getWords(words);
		orderWords(words);
		print(words);
	}

	public static void getWords(String[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three strings, each on a separate line: ");

		// TODO: Use Scanner to get three words for comparison
		// Store words in the array
		String userWords = "";
		for (int i = 0; i < 3; i++) {
			userWords = scanner.next();
			array[i] = userWords;
		}
		System.out.printf("You entered %s, %s, %s\n", array[0], array[1], array[2]);
	}

	public static void orderWords(String[] array) {
		// TODO: use array[n].compareTo(array[p] swap if out of order
		// continuing until array elements are in alphabetical order
		String temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i].compareTo(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	public static void swap(String[] array, int x, int y) {
		// TODO: swap array[x] with array[y]
		String temp = "";
		temp = array[y];
		array[y] = array[x];
		array[x] = temp;
	}

	public static void print(String[] array) {
		// TODO: print words in order separated by a space
		orderWords(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}