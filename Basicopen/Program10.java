package Basicopen;

import java.util.Scanner;

public class Program10 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the first number");
		int firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		int secondnumber = s.nextInt();

		int temporary;

		System.out.println("Before swapping");
				System.out.println("firstnumber - " + firstnumber);
				System.out.println("secondnumber - " + firstnumber);

		temporary = firstnumber;
		firstnumber = secondnumber;
		secondnumber = temporary;

		System.out.println("After swapping" );
		System.out.println("firstnumber - " + firstnumber);
		System.out.println("secondnumber - " + secondnumber);
	}
}
