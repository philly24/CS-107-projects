import java.util.Scanner;
/*
8.36 Lab 8a: Count by 3
This takes a users input and adds 3 until the end number is reached.
CS107-(Section 4)
Date 10/25/2020
@author  Phillip Vo
*/ 
public class CountBy3 {

static int count(int begin, int end) {
	
	while(begin < end) {
	System.out.print(begin + " ");
	begin += 3;
	}
	System.out.print(end + " ");
	return end;
}
	
	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int userBegin;
	int userEnd;
	System.out.println("Enter starting value: ");
	userBegin = scan.nextInt();
	System.out.println("Enter ending value: ");
	userEnd = scan.nextInt();
	System.out.println("Counting by " + userBegin + " up to " + userEnd + ":");
	count(userBegin, userEnd);

	
	
	
	

	
	
	}
}
