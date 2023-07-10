package Basicopen;

import java.util.Scanner;

public class Program11 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number");
		int number = s.nextInt();

		String res = (number % 2 == 0) ? "The entered number isvEvennumber" : "THe entered is number is odd number";

		System.out.println(res);
	}
}
