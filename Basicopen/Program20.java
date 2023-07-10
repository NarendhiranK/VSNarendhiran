package Basicopen;

import java.util.Scanner;

public class Program20 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number");
		int number = s.nextInt();
		System.out.println("The input number is :" + number);

		int reversenumber = 0;

		while (number > 0) {

			reversenumber = reversenumber * 10;

			reversenumber = reversenumber + number % 10;

			number = number / 10;

		}
		System.out.println("The reverse of the input number is :" + reversenumber);

	}
}
