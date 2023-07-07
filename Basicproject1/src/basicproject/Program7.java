package basicproject;

import java.util.Scanner;

public class Program7 {
	static int location;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = { 23, 12, 6, 5, 8, 9, 67, 54, 34, 21, 34, 44, 56, 65, 88, 8, 11, 31, 43 };
		System.out.println("Enter the element to find the location");
		int element = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {

				location=i;
			}
		}
		System.out.println("The location of the element is :" + location);

	}

}
