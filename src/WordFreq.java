import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
8.55 LAB 11e: Word frequencies
takes in words and determines the frequency the word is used. 
CS107-(Section 4)
Date 11/9/2020
@author  Phillip Vo
*/
public class WordFreq {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] words = new String[n];
		for (int i = 0; i < words.length; i++) {
			words[i] = in.next();
		}

		int count;
		for (int i = 0; i < words.length; i++) {
			count = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					++count;
				}
			}
			System.out.println(words[i] + " " + count);

		}

	}

}

/*
 * Ex: If the input is:
 * 
 * 5 hey hi Mark hi mark the output is:
 * 
 * hey 1 hi 2 Mark 1 hi 2 mark 1
 * 
 * 
 * 
 * public class WordFreq { public static void numFreq(ArrayList<String> list) {
 * HashMap<String, Integer> wordFreq = new HashMap<String, Integer>(); for
 * (String i : list) { Integer j = wordFreq.get(i); wordFreq.put(i, (j == null)
 * ? 1 : j + 1); }
 * 
 * // displaying the occurrence of elements in the arraylist for
 * (HashMap.Entry<String, Integer> val : wordFreq.entrySet()) {
 * System.out.println(val.getKey() + " " + val.getValue()); } } public static
 * void main(String[] args) { Scanner scan = new Scanner(System.in); int
 * arrLength; String word; arrLength = scan.nextInt(); ArrayList<String>
 * userWords = new ArrayList<String>(arrLength); for (int i = 0; i < arrLength;
 * i++) { word = scan.next(); userWords.add(word); } numFreq(userWords); } }
 * 
 */