// Exercise 8: Paint Calculator
import java.util.Scanner;


public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the length of the ceiling in feet? ");
		int length = sc.nextInt();
		
		System.out.print("What is the width of the ceiling in feet? ");
		int width = sc.nextInt();
		
		int sqFeet = length * width;
		
		/*
		 * Here we use the Math.ceil(doubleVal) method to get the rounded up
		 * value of the number of gallons of paint needed.
		 * Note that it is necessary to both convert sqFeet to double (in order
		 * to force a double result when dividing by 350)
		 * and to convert the result of Math.ceil back to an int.
		 */
		int gallonsNeeded = (int) Math.ceil((double) sqFeet / 350);
		
		System.out.println("You will need to purchase " + gallonsNeeded +
				" gallons of paint to cover " + sqFeet + " square feet.");
		
		sc.close();
	}

}
