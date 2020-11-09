
import java.util.Scanner;
/*
8.51 LAB 11a: Output numbers in reverse
reverses the array that the user inputed values for. 
CS107-(Section 4)
Date 11/9/2020
@author  Phillip Vo
*/
public class reverseNum {
   public static void main(String[] args) {
     
	   Scanner scnr = new Scanner(System.in);
    // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      int elementValue;
      // Add more variables as needed

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      int[] userList = new int[numElements]; 
      int[] reverseList = new int[numElements];
      /* Type your code here. */
      for (int i = 0; i < userList.length; i++) {
    	  elementValue = scnr.nextInt();
    	  userList[i] = elementValue;
	}
     
     
     
      for(int i = userList.length - 1; i >= 0; i--) { 
    	  if(i == 0)
    		  System.out.print(userList[i]);
    	  else
    		  System.out.print(userList[i] + " ");
      }
     System.out.println(" ");
      
   }
}

/*
Ex: If the input is:

5 2 4 6 8 10
the output is:

10 8 6 4 2

*/