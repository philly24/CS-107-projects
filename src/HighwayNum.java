
import java.util.Scanner;
/*
8.23 LAB 5e: Interstate highway numbers
Base on the number the user gives you, you output the free way that is associated with that number.
CS107-(Section 4)
Date 9/25/20
 @author  Phillip Vo
*/
public class HighwayNum {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int highwayNumber;
		highwayNumber = scnr.nextInt();

		if (highwayNumber < 100 && highwayNumber > 0) {
			if (highwayNumber % 2 == 0) {
				System.out.println("I-" + highwayNumber + " is primary, going east/west");
			} else {
				System.out.println("I-" + highwayNumber + " is primary, going north/south");
			}
		}
		if (highwayNumber >= 1000 || highwayNumber <= 0) {
			System.out.println(highwayNumber + " is not a valid interstate highway number.");
		}
		if (highwayNumber >= 100 && highwayNumber < 1000) {
			int highwayNumHolder = highwayNumber;

			String holder = Integer.toString(highwayNumHolder);
			String numHolder1 = holder.substring(1);
		
			// System.out.println(numHolder1 + " " + numHolder2);
			int auxNum = Integer.parseInt(numHolder1);
			if (highwayNumHolder % 2 == 0) {
				System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + auxNum + ", going east/west");
			} else {
				System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + auxNum + ", going north/south");
			}

		}

	}
}

/*
 * Primary U.S. interstate highways are numbered 1-99. Odd numbers (like the 5
 * or 95) go north/south, and evens (like the 10 or 90) go east/west. Auxiliary
 * highways are numbered 100-999, and service the primary highway indicated by
 * the rightmost two digits. T hus, I-405 services I-5, and I-290 services I-90.
 * 
 * Given a highway number, indicate whether it is a primary or auxiliary
 * highway. If auxiliary, indicate what primary highway it serves. Also indicate
 * if the (primary) highway runs north/south or east/west.
 * 
 * Ex: If the input is:
 * 
 * 90 the output is:
 * 
 * I-90 is primary, going east/west. Ex: If the input is:
 * 
 * 290 the output is:
 * 
 * I-290 is auxiliary, serving I-90, going east/west. Ex: If the input is:
 * 
 * 0 or any number not between 1 and 999, the output is:
 * 
 * 0 is not a valid interstate highway number.
 * 
 * 
 */