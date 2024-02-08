package Day1;

import java.util.scanner;

public class Reverse {
	
	public static void main (string) [] args) {
		scanner scanner = new scanner(system.in);
		system.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int reversedNumber = 0, remainder;
		
		while (number != 0) {
			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number /= 10;
		}
		
		system.out.printIn("Reversed number: " + reversedNumber);
	}
}