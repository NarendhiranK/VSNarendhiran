package Basicopen;

import java.util.Scanner;

public class Program1 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the first number");
		int firstnumber = s.nextShort();
		System.out.println("Enter the second number");
		int secondnumber = s.nextInt();

		int addtwonumber = firstnumber + secondnumber;

		System.out.println("The sum of the two numbers is :" + addtwonumber);

	}
}
