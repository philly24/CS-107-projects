import java.util.Scanner;
/*
8.29 Lab7a: LetterCount
Counting how many times the user char appears in the user sentence.
CS107-(Section 4)
Date 10/9/2020
@author  Phillip Vo
*/

public class LetterCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userSentence;
		char userCharacter;
		int userCounter = 0;
		userSentence = scan.nextLine();
		userCharacter = scan.next().charAt(0);
		char quotes = '"';

		for (int i = 0; i < userSentence.length(); i++) {
			if (userSentence.charAt(i) == userCharacter) {
				userCounter += 1;
			}

		}

		if (userCounter > 1 || userCounter == 0) {
			System.out.println("The letter '" + userCharacter + "' appears " + userCounter + " times in the string "
					+ quotes + userSentence + "." + quotes);
		} else {
			System.out.println("The letter '" + userCharacter + "' appears " + userCounter + " time in the string "
					+ quotes + userSentence +  "." + quotes);

		}

	}

}
