package Basicopen;

import java.util.Scanner;

public class Program9 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the first number");
		int firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		int secondnumber = s.nextInt();
		System.out.println("Enter the third number");
		int thirdnumber = s.nextInt();

		
		if (firstnumber >= secondnumber && firstnumber >= thirdnumber) {
			System.out.println("The largestnumber is the firstnumber");
		} else if (secondnumber >= thirdnumber && secondnumber >= firstnumber) {
			System.out.println("The largestnumber is the secondnumber");
		} else {
			System.out.println("The largestnumber is the thirdnumber");
		}

	}
}
