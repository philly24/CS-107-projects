import java.util.Scanner;

/*
8.49 LAB 10d: Driving cost - methods
user inputs miles per gallon and dollars per gallon then the method returns the total cost for driving 10, 50 and 400 miles.  
CS107-(Section 4)
Date 11/8/2020
@author  Phillip Vo
*/
public class driving {

	public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
		double totalCost;
		if (drivenMiles <= 50.0) {
			totalCost = (drivenMiles / milesPerGallon) * dollarsPerGallon;
			System.out.printf("%.2f", totalCost);
			System.out.print(" ");
		} else {
			
			totalCost = (drivenMiles / milesPerGallon) * dollarsPerGallon;
			System.out.printf("%.2f", totalCost);
		}

		return totalCost;
	}

	public static void main(String[] args) {
		System.out.println("start");
		Scanner scan = new Scanner(System.in);
		double userCost;
		double userGals;
		userGals = scan.nextDouble();
		userCost = scan.nextDouble();

		drivingCost(10.0, userGals, userCost);
		drivingCost(50.0, userGals, userCost);
		drivingCost(400.0, userGals, userCost);
		System.out.println("");
	}
}
