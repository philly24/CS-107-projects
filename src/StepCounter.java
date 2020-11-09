import java.util.Scanner;

/*
8.42 LAB 9b: Step counter
Takes in the users steps and converts it into miles
CS107-(Section 4)
Date 11/1/2020
@author  Phillip Vo
*/
public class StepCounter {

	public static double stepToMiles(int userSteps) {
		
		double convertSteps = (double) userSteps / 2000;
		return convertSteps;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userSteps;
		userSteps = scan.nextInt();
		System.out.printf("%.2f", stepToMiles(userSteps));
	}
}
