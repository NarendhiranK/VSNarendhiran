package Basicopen;

import java.util.Scanner;

public class Program8 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the character");
		char ch = s.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

			System.out.println("The entered character is vowel ");

		else

			System.out.println("The entered character is not a vowel");

	}
}
