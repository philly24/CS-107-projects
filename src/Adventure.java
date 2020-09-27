import java.util.Scanner;

/*
8.20 Lab 5b: Adventure Game
This is a text base game that takes the user string input as directions. This program also utilize nested for loops.
CS107-(Section 4)
Date 9/27/20
 @author  Phillip Vo
 */
class Adventure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		String userInput1;
		String userInput2;

		System.out.println("Enter your name: ");
		userName = scan.next();

		System.out.println("Hello " + userName + "! You enter a creepy house. Would you like to go into the cellar or upstairs?");
		userInput1 = scan.next();
		if (userInput1.equalsIgnoreCase("cellar")) {
			System.out.println("You walk down the cellar steps. To your right, you see a mysterious coffin and to the left, you see a sarcophagus. Would you like to investigate the coffin or sarcophagus?");
			userInput2 = scan.next();
			if (userInput2.equalsIgnoreCase("coffin"))
				System.out.println("You walk closer to the coffin and a vampire jumps out and bites your neck. Congrats, you are now a vampire!");
			else if (userInput2.equalsIgnoreCase("sarcophagus"))
				System.out.println("You walk closer to the sarcophagus and a mummy rises out of it!");
			else if (userInput2.equalsIgnoreCase("exit"))
				System.out.println("You leave the house just as you walked in.");
	    }
		else if (userInput1.equalsIgnoreCase("upstairs")) {
			System.out.println("You walk upstairs. To your right, there is a door to a bedroom. To your left, there is a bathroom. Would you like to investigate the bedroom or bathroom?");
			userInput2 = scan.next();
			if (userInput2.equalsIgnoreCase("bedroom"))
				System.out.println("You walk into the bedroom and a zombie jumps out and bites you. Congrats, you are a zombie!");
			else if (userInput2.equalsIgnoreCase("bathroom"))
				System.out.println("You walk into the bathroom and you see a ghost behind you in the mirror.");
			else if (userInput2.equalsIgnoreCase("exit"))
				System.out.println("You leave the house just as you walked in.");
		} 
		else {
			System.out.println("You leave the house just as you walked in.");
		}

	}
}