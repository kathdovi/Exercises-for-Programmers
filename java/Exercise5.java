// Exercise 5: Simple Math
import java.util.Scanner;


public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the first number? ");
		
		/*
		 * Previously we have used .nextLine() to get input. Now we want to use
		 * .nextInt() in order to get the user's input as an int, not a String.  
		 */
		int num1 = sc.nextInt();
		
		System.out.print("What is the second number? ");
		int num2 = sc.nextInt();
		
		/*
		 * Here we start printing the outputs as usual. As you can see, you can
		 * even do numeric math expressions inside of the println statement!
		 * Do note that it is necessary (and good coding style) to put the
		 * expressions in parentheses.
		 */
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		
		/*
		 * Dividing is a special case, since the result isn't always a whole
		 * number.
		 * Now, we introduce a new data type called "double" (short for
		 * double-precision floating-point number) that allows for decimal
		 * numbers.
		 * Moreover, on the right side of the equal sign you can see "(double)".
		 * This is used to convert num1 to a double. This forces the result to 
		 * be a double rather than an int.
		 * That is to say, dividing with two ints will always return an int
		 * value. Dividing with at least one value as a double will always 
		 * return a double value.
		 */
		double dividedResult = (double) num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + dividedResult);
		
		sc.close();
	}

}
