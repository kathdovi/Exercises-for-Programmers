// Exercise 3: Printing Quotes
import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {
		// Create the Scanner object.
		Scanner sc = new Scanner(System.in);
		
		// Print the prompt asking the user for the quote.
		System.out.print("What is the quote? ");
		
		// Read in the quote from the scanner.
		String quote = sc.nextLine();
		
		// Print the prompt asking the user who said the quote.
		System.out.print("Who said it? ");
		
		// Read in the quote from the scanner.
		String speaker = sc.nextLine();
		
		/*
		 * Print the speaker along with their quote.
		 * Note that when using quotation marks in a String value, you must
		 * preface it with a '\'.
		 */
		System.out.println(speaker + " says, \"" + quote + "\"");
		
		// Close the Scanner object.
		sc.close();
	}

}
