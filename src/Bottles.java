
import java.util.Scanner;
/*
8.46 Lab 10a: Bottles
This tracks how many beers are on the wall and counts down from thei initial starting point.  
CS107-(Section 4)
Date 11/1/2020
@author  Phillip Vo
*/
public class Bottles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many bottles of beer on the wall now?");
		int bottles = scan.nextInt();

		// loop through the song lyrics until no more bottles on the wall
		for (int i = bottles; i > 0; i--) {
			beerOnTheWall(i);
			bottlesOfBeer(i);
			takeOneDown();
			beerOnTheWall(i-1);
			System.out.println("");
		}
	}

	// Write beerOnTheWall method here which has one int parameter for number of
	// bottles
	public static void beerOnTheWall(int numBottles) { 
		if (numBottles == 1) 
			System.out.println(numBottles + " bottle of beer on the wall");	
		else if(numBottles == 0)
			System.out.println("No more bottles of beer on the wall");
		else 
			System.out.println(numBottles + " bottles of beer on the wall");
			
	}

	// Write bottlesOfBeer method here which has one int parameter for number of
	// bottles
	public static void bottlesOfBeer(int numBottles) {
		if (numBottles ==1) 
			System.out.println(numBottles + " bottle of beer");
		else
			System.out.println(numBottles + " bottles of beer");
		
	}

	// Write takeOneDown method here, having an empty parameter list
	public static void takeOneDown() {
		System.out.println("Take one down, pass it around");
		
	}
}
