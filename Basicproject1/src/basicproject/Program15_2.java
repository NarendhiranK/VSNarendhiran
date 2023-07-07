package Basicclosed;

import java.util.Scanner;

public class Program15_2 {

	static String res = "Not present";
	static int location;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int count = 1;
		int[] a = { 23, 12, 6, 5, 8, 9, 67, 54, 34, 23, 12, 9, 8, 88, 8, 11, 31, 43, 23, 23, 23, 23 };
		System.out.println("Enter the element to check whether the element is present or not");
		int input = s.nextInt();
		for (int i = 0; i < a.length - 1; i++) {
			if (input == a[i] && a[i] == a[i + 1]) {
				res = "present";
				count++;
				location = i;

				System.out.println("The element is : " + res + " ");
				System.out.println("count of the element is " + count + " ");
				System.out.println("location of the element is" + " " + location);

			}

		}

	}
}
