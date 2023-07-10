package Basicopen;

import java.util.Scanner;

public class Program22 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number");

		int number = s.nextInt();
		String res = "Prime";

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				res = "Not Prime";
			}
		}

		System.out.println(res);
	}
}
