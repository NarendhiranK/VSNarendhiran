package Basicopen;

import java.util.Scanner;

public class Program13 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter any integer value below 10 :");
		int number = s.nextInt();
		int sum = 0;

		while (number <= 10) {
			sum = sum + number;
			number++;
		}
		System.out.println("The sum of the numbers in the while loop is : " + sum);

	}
}
