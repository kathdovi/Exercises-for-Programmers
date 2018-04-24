// Exercise 8: Paint Calculator
import java.util.Scanner;


public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Here we introduce arrays. This is a way to hold a fixed number of
		 * objects of a specific type (here a collection of three ints).
		 * 
		 * To read more about arrays:
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
		 */
		int[] priceList = new int[3];
		int[] quantityList = new int[3];
		
		/*
		 * Here we introduce loops. This is a way to repetitively execute a
		 * block of code. This particular loop is called a for loop. In the 
		 * for loop's parentheses contains three statements each separated by a
		 * semicolon. The first statement is done before the block of code is
		 * executed for the first time. The third statement is what is done
		 * after each time the block runs. The second statement is the condition
		 * which must be satisfied in order for the block of code to continue
		 * running.
		 * 
		 * To read more about for loops:
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
		 * 
		 * By the way, the ++ operator in Java is used to increment a variable
		 * by 1.
		 */
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter the price of item " + (i + 1) + ": ");
			int currentPrice = sc.nextInt();
			
			/*
			 * In order to read/write to a specific area of the array, use the
			 * brackets with an integer inside of it (from zero up to one less
			 * than the array's length) at the end of the array's name.
			 */
			priceList[i] = currentPrice;
			
			System.out.print("Enter the quantity of item " + (i + 1) + ": ");
			int currentQuan = sc.nextInt();
			quantityList[i] = currentQuan; 
		}
		
		int subtotal = 0;
		for(int i = 0; i < 3; i++) {
			/*
			 * The += operator is used to add to the left side of the operator
			 * whatever is on the right side of the operator.
			 */
			subtotal += quantityList[i] * priceList[i]; 
		}
		
		double tax = 0.055 * subtotal;
		double total = subtotal + tax;
		
		/*
		 * Instead of println or print, here we use printf in order to format
		 * the totals into proper dollar/cent format. %.2f in the String below
		 * is a placeholder for a double value that will display only the first
		 * two decimal points.
		 * 
		 * To read more about formatted printing:
		 * https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		 */
		System.out.printf("Subtotal: $%.2f\n", (double)subtotal);
		System.out.printf("Tax: $%.2f\n", tax);
		System.out.printf("Total: $%.2f\n", total);
	}

}
