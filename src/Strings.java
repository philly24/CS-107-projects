import java.util.Scanner;

public class Strings {
   
   public static String idString() {
       // FIX ME:  Replace FirstName with your first name  
       //          and replace LastName with your last name.
       return "Strings, Phillip Vo";
   }
   
   public static void main(String[] args) {
      System.out.print("Enter a city, state: ");
      Scanner scan = new Scanner(System.in);
      String city;
      String state;
      
      city = scan.next();
      state = scan.next();
      
      String fixCity = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();      
      String fixState = state.substring(0).toUpperCase();
      System.out.println(fixCity + ", " + fixState);
      
      
   }
}