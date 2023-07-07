package Basicclosed;

import java.util.Arrays;

public class Program6 {

	public static void main(String[] args) {

		int[] a = { 23, 12, 6, 5, 8, 9, 67, 54, 34, 21, 34, 44, 56, 65, 88, 8, 11, 31, 43 };
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("The ascending order of the array is :" + Arrays.toString(a));
	}
}
