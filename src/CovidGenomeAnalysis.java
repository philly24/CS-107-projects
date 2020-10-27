import java.util.Scanner;

public class CovidGenomeAnalysis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numA = 0;
		String genomeAnalysis;
		String gaHolder = "";
		genomeAnalysis = scan.nextLine();
		for (int i = 0; i < genomeAnalysis.length(); i++) {
			if (genomeAnalysis.charAt(i) == 'A') {
			genomeAnalysis = genomeAnalysis + genomeAnalysis.substring(i, i + 1).replace("A", "T");
				numA += 1;
			}

			else if (genomeAnalysis.charAt(i) == 'T')
				gaHolder = gaHolder +  genomeAnalysis.substring(i, i + 1).replace("T", "A");

			else if (genomeAnalysis.charAt(i) == 'C')
				gaHolder = gaHolder +  genomeAnalysis.substring(i, i + 1).replace("C", "G");

			else
				gaHolder = gaHolder +  genomeAnalysis.substring(i, i + 1).replace("G", "C");

		}
		System.out.println(numA + " " + gaHolder);

	}

}

/*
 *  public static void main(String [] args) {         Scanner scan = new
 * Scanner(System.in);
 * 
 *         String genomeAnalysis = scan.nextLine();         int numA = 0;
 * 
 *         for (int i = 0; i < genomeAnalysis.length(); i++) {             if
 * (genomeAnalysis.charAt(i) == 'A') {
 *                 genomeAnalysis.replace("A", "T");                 numA += 1;
 *             }             else if (genomeAnalysis.charAt(i) == 'T') {
 *                 genomeAnalysis.replace("T", "A");             }
 *             else if (genomeAnalysis.charAt(i) == 'C') {
 *                 genomeAnalysis.replace("C", "G");             }
 *             else {                 genomeAnalysis.replace("G", "C");
 *             }         }         System.out.println(numA + " " +
 * genomeAnalysis);
 * 
 *     }
 * 
 * 
 * 
 */
