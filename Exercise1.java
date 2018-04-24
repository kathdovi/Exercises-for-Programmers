// Exercise 1: Saying Hello
import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the keyboard (System.in).
		Scanner sc = new Scanner(System.in);

		// Print the prompt asking the user for their name.
		System.out.print("What is your name? ");
		
		// Read in the user's name as a String object.
		String name = sc.nextLine();
		
		/* 
		 * Print out the welcome message. Note the "println" on the following 
		 * line. This automatically will move to the next line, whereas "print"
		 * (as seen on line 12) will stay on the same line.
		 */
		System.out.println("Hello, " + name + ", nice to meet you!");
		
		// Close the Scanner object.
		sc.close();
	}

}
