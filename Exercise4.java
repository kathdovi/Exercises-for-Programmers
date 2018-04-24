// Exercise 4: Mad Lib
import java.util.Scanner;


public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a noun: ");
		String noun = sc.nextLine();

		System.out.print("Enter a verb: ");
		String verb = sc.nextLine();

		System.out.print("Enter a adjective: ");
		String adj = sc.nextLine();

		System.out.print("Enter a adverb: ");
		String adv = sc.nextLine();

		/*
		 * Concatenation is often a good, simple way to combine strings.
		 * However, for combining a lot of Strings, it makes code harder to read
		 * and at some point can even make your code run slower. So, as an
		 * alternative, create a StringBuilder object and place all values in
		 * that object.
		 */
		StringBuilder sb = new StringBuilder();
		
		/*
		 * To start putting things in your StringBuilder use .append(val).
		 * Much like concatenation, Strings and numeric values can be appended
		 * to the StringBuilder.
		 * 
		 * First here we append the first part of the output.
		 */
		sb.append("Do you ");
		
		// Append to the StringBuilder object the user's verb.
		sb.append(verb);
		
		// Append more text to the StringBuilder.
		sb.append(" your ");
		
		// Append to the StringBuilder object the user's adjective.
		sb.append(adj);
		
		// Append a space.
		sb.append(" ");

		// Append to the StringBuilder object the user's noun.
		sb.append(noun);
		
		// Append a space.
		sb.append(" ");
		
		// Append to the StringBuilder object the user's adverb.
		sb.append(adv);
		
		// Append the final sentence.
		sb.append("? That's hilarious!");

		/*
		 * Having appended all of the necessary text, we can now output the
		 * resulting phrase that is currently held inside of th StringBuilder
		 * object
		 */
		System.out.println(sb);

		sc.close();
	}

}
