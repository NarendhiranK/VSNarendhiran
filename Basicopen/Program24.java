package Basicopen;

import java.util.Arrays;
import java.util.Scanner;

public class Program24 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		int[] a = new int[s.nextInt()];
		int sum = 0;
		System.out.println("Enter the values of the array");
		for (int i = 0; i < a.length; i++) {

			a[i] = s.nextInt();

			System.out.println("Enter the next value");
		}
		System.out.println("The array is : " + Arrays.toString(a));

		for (int i : a) {

			sum += i;

		}
		System.out.println("The sum of the array elements is : " + sum);
	}
}
