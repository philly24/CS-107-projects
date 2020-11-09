import java.util.Scanner;

public class MidTerm {
	public static void printName(String name, int id) {
		   System.out.print(name + " ID: " + id);
		}
		public static void printName(int id) {
		   System.out.print("Name" + " ID: " + id);
		}
		public static void printName(String name, int id, int age) {
		   System.out.print(name + " ID: " + id + " age: " + age);
		}
	
	public static void main(String[] args) {
		System.out.println("start");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i < num; ++i) {
		 int  curr = scan.nextInt();
		   System.out.print(curr);
		}
		 
		
	}
}
