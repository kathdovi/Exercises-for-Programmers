// Exercise 2: Counting the Number of Characters
import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		// Create the Scanner object.
		Scanner sc = new Scanner(System.in);
		
		// Print the prompt asking the user for the input string.
		System.out.print("What is the input string? ");
		
		// Read in the input from the Scanner.
		String input = sc.nextLine();
		
		/*
		 * Get the length of the String above (.length()) and store it to an
		 * integer value (int).
		 */
		int inputLength = input.length();
		
		/* 
		 * Print out the message. One easy way to combine Strings in Java is
		 * with the '+' operator (called concatenation). Strings can
		 * readily be concatenated with other String objects and numeric values. 
		 */
		System.out.println(input + " has " + inputLength + " characters.");
		
		// Close the Scanner object.
		sc.close();
	}

}
