package Basicclosed;

import java.util.Iterator;
import java.util.Scanner;

public class Program4 {
	static String res = "prime";
	static int count = 0;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number");
		int input = s.nextInt();
		for (int i = 1; i <= input; i++) {
			if (input % 2 == 0) {
				count++;
			}
		}
		if (count > 2) {
			res = "not prime";
		}
		System.out.println(res);
	}

}
