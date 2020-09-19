import java.util.Scanner;
import java.util.Arrays;

public class RemovingRGB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value1;
		int value2;
		int value3;

		value1 = scan.nextInt();
		value2 = scan.nextInt();
		value3 = scan.nextInt();

		int[] arr = { value1, value2, value3 };
		Arrays.sort(arr);
		arr[1] = arr[1] - arr[0];
		arr[2] = arr[2] - arr[0];
		arr[0] = 0;
		
		System.out.println(arr[1] + " " + arr[0] + " " + arr[2]);
	}
}
