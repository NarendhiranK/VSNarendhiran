package Basicopen;

import java.util.Scanner;

public class Program3 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the first number");
		int firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		int secondnumber = s.nextInt();

		int multipliednumber = firstnumber * secondnumber;

		System.out.println("The multiplied value of the two numbers is the :" + multipliednumber);

	}
}
