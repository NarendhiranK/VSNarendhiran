package Basicclosed;

import java.util.Scanner;

public class Program5 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		averagenumber();

	}

	public static int averagenumber() {

		System.out.println("Enter the number to find the average");
		int input = s.nextInt();
		int sum = 0;
		int average;
		for (int i = 0; i <= input; i++) {

			sum = sum + i;

		}
		average = sum / input;
		System.out.println(average);
		return sum;

	}
}
