import java.util.Scanner;

public class ApartmentSales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userView;
		int userGPS;	
		int userAnswer = 0;
		System.out.println("Please select a view: (1) Park (2) Golf Course (3)");
		System.out.println("Please select a parking option: (1) Garage (2) Space");
		
		userView = scan.nextInt();
		userGPS = scan.nextInt();
		switch (userView) {
         case 1:
            userAnswer = 150000;
            break;
         case 2:
            userAnswer = 170000;
            break;
         case 3:
            userAnswer = 210000;
            break;
         default:
            userAnswer = 0;
            break;
      }
		 
		if (userView == 1 && userGPS == 1) {
			userAnswer += 5000;
			System.out.println("Your choice: Park view with a garage");
			System.out.println("Estimated price: " + userAnswer);
			
		}
		
		
	}
}

/*
 * ApartmentSales.java
 * 
 * You've been hired to automate the Summerdale Sales Office's apartment price
 * estimation system.
 * 
 * It will need to:
 * 
 * Ask the user to choose:
 * 
 * - 1 for park view - 2 for golf course view - 3 for lake view Park view
 * apartments are $150k, apartments with gold course views are $170k, and
 * apartments with the lake views are $210k. If the user enters an invalid code,
 * set the price to 0.
 * 
 * It should also ask the user to specify if they want a:
 * 
 * - 1 garage - 2 parking space but only if the view selection is valid.
 * 
 * Add $5k to the price of any apartment with a garage. If the parking vaule is
 * invalid, display an appropriate massage and assume that the price for a
 * apartment with no garage.
 * 
 * Sample expected output for a park view with a parking space:
 * 
 * Please select a view: (1) Park (2) Golf Course (3) Lake Please select a
 * parking option: (1) Garage (2) Space Your choice: Park view with a parking
 * space Estimated price: $150000
 * 
 * 
 */