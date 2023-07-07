package Assignment3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymethods {
	static Scanner s = new Scanner(System.in);
	static Arraymethods am = new Arraymethods();

	public static void arrayimplementation() {
		System.out.println("Array Programmings");
		System.out.println(
				"1.Array Initilization \n2.Array Traversal \n3.Array sum \n4.Array Average \n5.Array Maximum and minimum \n6.Array Sorting \n7.Array Search \n8.Array Modification");
		int input = s.nextInt();
		switch (input) {
		case 1: {
			am.Arrayvalues();

		}
			break;
		case 2: {
			am.traversearray();
		}
			break;
		case 3: {
			am.sumofelementsinthearray();
		}
			break;

		case 4: {
			am.averagevaluesinarray();
		}
			break;

		case 5: {
			am.maxandminvalues();
		}
			break;
		case 6: {
			am.ascendingorder();
		}
			break;

		case 7: {
			am.location();
		}
			break;

		case 8:

		{
			am.arraymodification();
		}
			break;

		default: {
			System.out.println("Please enter the proper input");
		}

		}
	}

	public void Arrayvalues() {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("The Array values are :" + Arrays.toString(a));
	}

	public void traversearray() {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("The input array is :" + Arrays.toString(a));
		System.out.print("The traverse of the array is :");
		for (int i : a) {

			System.out.print(i + " ");
			return;
		}
	}

	public void sumofelementsinthearray() {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("The input array is :" + Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("The total sum of the elements in the array is : " + sum);
	}

	public void averagevaluesinarray() {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("The input array is :" + Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int average = sum / (a.length);
		System.out.println("The average values of the arrays are : " + average);
	}

	public void maxandminvalues() {
		int[] a = { 87, 45, 34, 65, 88, 99, 101, 4, 5, 67, 77, 45, 34, 87, 56 };
		System.out.println("The input array is :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("The minimum values in the arrays are : " + a[0]);
		System.out.println("The maximum values in the arrays are : " + a[a.length - 1]);
	}

	public void ascendingorder() {
		int[] a = { 87, 45, 34, 65, 88, 99, 101, 4, 5, 67, 77, 45, 34, 87, 56 };
		System.out.println("The input array is :" + Arrays.toString(a));
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
		System.out.println("The Ascending order of the arrays are : " + Arrays.toString(a));
	}

	public void location() {
		int location = 0;
		int[] a = { 87, 45, 34, 65, 88, 99, 101, 4, 5, 67, 77, 45, 34, 87, 56 };
		System.out.println("THe input array is : " + Arrays.toString(a));
		String res = "Not present";
		System.out.println("Enter the key element to search");
		int key = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				res = "present";
				location = i;
			}
		}
		System.out.println("The enter element is :" + res);
		System.out.println("THe index of the element is :" + location);
	}

	public void arraymodification() {
		int[] a = { 87, 45, 34, 65, 88, 99, 101, 4, 5, 67, 77, 45, 34, 87, 56 };
		System.out.println("The input array is : " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter the index value should modified");
			int n = s.nextInt();
			i = n;
			System.out.println("Enter the value which should be modified");
			a[i] = s.nextInt();
			System.out.println("After the modification of the arrays is : " + Arrays.toString(a));
		}
	}

}
