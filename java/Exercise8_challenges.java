// Exercise 8: Pizza Party
import java.util.Scanner;


public class Exercise8_challenges {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people? ");
		int people = sc.nextInt();
		
		System.out.print("How many pizzas do you have? ");
		int pizzas = sc.nextInt();
		
		System.out.print("How many slices per pizza? ");
		int sliceRate = sc.nextInt();
		
		int totalSlices = pizzas * sliceRate;
		
		/*
		 * Dividing an int by an int will always return an int. When the
		 * numerator (totalSlices) is not evenly divisible by the denominator
		 * (people), then the fraction part is simply chopped off.
		 */
		int slicesPerPerson = totalSlices / people;
		
		/*
		 * Here we introduce the % (modulus) operator. The modulus gives the
		 * remainder of dividing the numerator by the denominator. Here, we use
		 * it to determine the number of remaining slices of pizza after
		 * dividing it evenly among all the people.
		 */
		int leftoverSlices = totalSlices % people;
		
		/*
		 * Here we introduce if statements to determine what to print.
		 * If the condition inside of the parentheses if statement is satisfied
		 * (here, if the value of pizzas is 1), then the block of code is
		 * executed.
		 * The "else" is a catch-all that is only executed if the other
		 * condition is unsatisfied. 
		 * 
		 * Read more about if statements:
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
		 */
		if (pizzas == 1) {
			System.out.println(people + " people with 1 pizza");
		} else {
			System.out.println(people + " people with " + pizzas + " pizzas");
		}
		
		if (slicesPerPerson == 1) {
			System.out.println("Each person gets 1 piece of pizza.");
		} else if (slicesPerPerson == 0) {
			System.out.println("There is not enough pizza for each person to "
					+ "get a slice.");
		} else {
			System.out.println("Each person gets " + slicesPerPerson +
					" pieces of pizza.");
		}
		
		/*
		 * Yes, you can even have if statements inside of if statements!
		 */
		if (slicesPerPerson > 0) {
			if (leftoverSlices == 1) {
				System.out.println("There is 1 leftover piece.");
			} else {
				System.out.println("There are " + leftoverSlices +
						" leftover pieces.");
			}
		}
		
		sc.close();
	}
	
}
