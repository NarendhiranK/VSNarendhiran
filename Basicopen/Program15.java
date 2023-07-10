package Basicopen;

import java.util.Scanner;

public class Program15 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int tech = 2;

		switch (tech) {
		case 1: {
			System.out.println("Java");
		}
			break;

		case 2: {
			System.out.println("Python");
		}

			break;

		default: {
			System.out.println("Not listed");
		}
			break;
		}
	}
}
