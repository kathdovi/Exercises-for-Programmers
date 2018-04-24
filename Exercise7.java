// Exercise 7: Area of a Rectangular Room
import java.util.Scanner;


public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the length of the room in feet? ");
		int length = sc.nextInt();
		
		System.out.print("What is the width of the room in feet? ");
		int width = sc.nextInt();
		
		System.out.println("The area is:");
		
		int sqFeet = length * width;
		
		/*
		 * Note that no conversion to a double is needed here because writing a
		 * decimal implicitly creates a double value. As already mentioned, an
		 * int times a double is always a double. 
		 */
		double sqMeters = sqFeet * 0.09290304;
		
		System.out.println(sqFeet + " square feet");
		System.out.println(sqMeters + " square meters");
		
		sc.close();
	}

}
