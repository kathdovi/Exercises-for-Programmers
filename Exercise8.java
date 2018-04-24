// Exercise 8: Pizza Party
import java.util.Scanner;


public class Exercise8 {

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
		
		System.out.println(people + " people with " + pizzas + " pizzas");
		System.out.println("Each person gets " + slicesPerPerson +
				" pieces of pizza.");
		System.out.println("There are " + leftoverSlices + " leftover pieces.");
		
		sc.close();
	}

}
