// Exercise 6: Retirement Calculator
import java.util.Calendar;
import java.util.Scanner;


public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your current age? ");
		int currAge = sc.nextInt();
		
		System.out.print("At what age would you like to retire? ");
		int retAge = sc.nextInt();
		
		int timeLeft = retAge - currAge;
		
		System.out.println("You have " + timeLeft + " years left until you can "
				+ "retire");
		
		// Create a new Calendar object.
		Calendar now = Calendar.getInstance();
		
		/*
		 * Utilize the .get(calendarField) method in order to get the year from
		 * the calendar object.
		 */
		int year = now.get(Calendar.YEAR);
		
		/*
		 * Print as usual. Note here that when printing single quotations, you
		 * must also preface it with a backslash like you previously did with a
		 * the quotation mark.
		 */
		System.out.println("It\'s " + year + ", so you can retire in " + 
				(year + timeLeft));
		
		sc.close();
	}

}
