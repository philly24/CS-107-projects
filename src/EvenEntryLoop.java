import java.util.Scanner;

/*
8.39 Lab 8d: Even Entry Loop
this takes in a user input and determines if it is even or odd and if 999 was inputed to quit.
CS107-(Section 4)
Date 10/25/2020
@author  Phillip Vo
*/ 
public class EvenEntryLoop {

	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int userAnswer;
	int endNum = 999;
	do{
		System.out.println("Enter an even number or 999 to quit: ");
		userAnswer = scan.nextInt();
		if(userAnswer % 2 == 0) 
			System.out.println("Good job!");
		else if(userAnswer % 2 != 0 && userAnswer != 999)
			System.out.println(userAnswer +" is not an even number.");
	}
	while(userAnswer != 999) ;
		
	
	}
}
