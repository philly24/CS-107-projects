import java.util.Scanner;

/*
8.37 Lab 8b: Count by 3 Expanded
This takes a users input and adds 3 until the end number is reached and only prints the end number if it fits ins't over or under then ending value.
CS107-(Section 4)
Date 10/25/2020
@author  Phillip Vo
*/
public class CountBy3e {
	static int userBegin;
	static int userEnd;
	
	static int checkEnd(int begin, int end) {
		while (begin < end) {
			begin += 3;
		}
		if(begin > end || begin < end)
		userEnd = begin;
		else
			userEnd = end; 
		return userEnd;
	}
	static int count(int begin, int end) {

		while (begin <= end) {
			System.out.print(begin + " ");
			begin += 3;
		}
			

		return end;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter starting value: ");
		userBegin = scan.nextInt();
		System.out.println("Enter ending value: ");
		userEnd = scan.nextInt();
		checkEnd(userBegin, userEnd);
		System.out.println("Counting by 3 from " + userBegin + " to " + userEnd + ":");
		count(userBegin, userEnd);
	}
}
