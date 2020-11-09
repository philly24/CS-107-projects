import java.util.Scanner;

/*
8.44 LAB 9d: Exact change - methods
Takes in a total amount of money and then it disperse it into how many dollar bills, pennys, nickels, dimes, and quarters for the change. 
CS107-(Section 4)
Date 11/1/2020
@author  Phillip Vo
*/
public class ExactChange2 {
	static int[] coinVals = new int[5];
	static int checkZero;

	public static void exactChange(int userTotal, int[] coinVals) {

		if (userTotal >= 100) {
			userTotal -= 100;
			coinVals[0] += 1;
			exactChange(userTotal, coinVals);
			return;
		} else if (userTotal >= 25) {
			userTotal -= 25;
			coinVals[1] += 1;
			exactChange(userTotal, coinVals);
			return;
		} else if (userTotal >= 10) {
			userTotal -= 10;
			coinVals[2] += 1;
			exactChange(userTotal, coinVals);
			return;
		} else if (userTotal >= 5) {
			userTotal -= 5;
			coinVals[3] += 1;
			exactChange(userTotal, coinVals);
			return;
		} else if (userTotal >= 1) {
			userTotal -= 1;
			coinVals[4] += 1;
			exactChange(userTotal, coinVals);
			return;
		} 

		if (coinVals[0] == 1) {
			System.out.println(coinVals[0] + " dollar");
		}
		if (coinVals[0] > 1) {
			System.out.println(coinVals[0] + " dollars");
		}
		if (coinVals[1] == 1) {
			System.out.println(coinVals[1] + " quarter");
		}
		if (coinVals[1] > 1) {
			System.out.println(coinVals[1] + " quarters");
		}
		if (coinVals[2] == 1) {
			System.out.println(coinVals[2] + " dime");
		}
		if (coinVals[2] > 1) {
			System.out.println(coinVals[2] + " dimes");
		}
		if (coinVals[3] == 1) {
			System.out.println(coinVals[3] + " nickel");
		}
		if (coinVals[3] > 1) {
			System.out.println(coinVals[3] + " nickels");
		}
		if (coinVals[4] == 1) {
			System.out.println(coinVals[4] + " penny");
		}
		if (coinVals[4] > 1) {
			System.out.println(coinVals[4] + " pennys");
		}

	}

	public static void main(String[] args) {
	//	System.out.println("start");
		Scanner scan = new Scanner(System.in);
		int moneyTotal = scan.nextInt();
		if (moneyTotal == 0)
			System.out.println("no change");
		coinVals[0] = 0;
		coinVals[1] = 0;
		coinVals[2] = 0;
		coinVals[3] = 0;
		coinVals[4] = 0;
		exactChange(moneyTotal, coinVals);
	}
}