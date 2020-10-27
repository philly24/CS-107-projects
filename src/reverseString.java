import java.util.Scanner;
/*
8.34 LAB 7e: Print string in reverse
This takes a users input and prints the string out in reverse.
CS107-(Section 4)
Date 10/9/2020
@author  Phillip Vo
*/ 
public class reverseString{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String userInput;
		System.out.println("start");
		
		do {
			
			userInput = scan.nextLine();
			if (userInput.equals("q") || userInput.equals("quit") || userInput.equals("Quit")) {
				break;
			}
			for (int i = userInput.length() - 1; i >= 0; i--) {
				System.out.print(userInput.charAt(i));
				
			}
			System.out.println("");
			
		}
		while(true);
			
			
			
		}



	
}






