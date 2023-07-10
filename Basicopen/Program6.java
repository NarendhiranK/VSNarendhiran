package Basicopen;

import java.util.Scanner;

public class Program6 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the dividend");
		int dividend = s.nextInt();
		System.out.println("Enter the divisor");
		int divisor = s.nextInt();

		int quotient = dividend / divisor;

		int reminder = dividend % divisor;

		System.out.println("THe quotient value is :" + quotient);
		System.out.println("The reminder value is :" + reminder);

	}
}
