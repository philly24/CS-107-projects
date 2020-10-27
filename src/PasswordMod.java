
import java.util.Scanner;

public class PasswordMod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userPassword;
		userPassword = scan.next();
		String newUserPassword = "";

		for (int i = 0; i < userPassword.length(); i++) {
			if (userPassword.charAt(i) == 'i')
				newUserPassword += '!';
			else if (userPassword.charAt(i) == 'a')
				newUserPassword += '@';
			else if (userPassword.charAt(i) == 'm')
				newUserPassword += 'M';
			else if (userPassword.charAt(i) == 'B')
				newUserPassword += '8';
			else if (userPassword.charAt(i) == 'o')
				newUserPassword += '.';
			else
				newUserPassword += userPassword.charAt(i);

		}
		System.out.println(newUserPassword + "q*s");
	}
}