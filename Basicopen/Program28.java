package Basicopen;

import java.util.Scanner;

public class Program28 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of the rows of the floyd's triangle :");
		int rows = s.nextInt();
		int number = 1;
		int counter;
		int j;

		System.out.println("Floyd's triangle");
		System.out.println("*****************");

		for (counter = 1; counter <= rows; counter++) {
			for (j = 1; j <= counter; j++) {

				System.out.print(number + " ");

				number++;

			}
			System.out.println();
		}
	}
}
