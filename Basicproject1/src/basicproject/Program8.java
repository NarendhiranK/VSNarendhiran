package Basicclosed;

public class Program8 {

	public static void main(String[] args) {

		int[] a = { 23, 12, 6, 5, 8, 9, 67, 54, 34, 21, 34, 44, 56, 65, 88, 8, 11, 31, 43 };
		System.out.print("For reversing the array is :" + " ");
		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i] + " ");
		}
	}
}
