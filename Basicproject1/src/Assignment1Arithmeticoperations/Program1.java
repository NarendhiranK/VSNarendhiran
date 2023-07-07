package basicproject2;

import java.util.Scanner;

public class Program1 {

	static Scanner s = new Scanner(System.in);
	static int firstnumber;
	static int secondnumber;
	static boolean b = false;

	public static void main(String[] args) {

		calculatoroperations();

	}

	public static void calculatoroperations() {
		do {
			System.out.println("\n1.Addition \n2.Substraction \n3.Multiplication \n4.Division \n5.power value");
			System.out.println("Which operation to be perform.........?");
			int n = s.nextInt();
			switch (n) {

			case 1: {
				addition();
			}
				break;
			case 2: {
				substraction();
			}
				break;
			case 3: {
				multiplication();
			}
				break;
			case 4: {
				division();
			}
			
				break;

			case 5: {
				powercalculation();
			}
			default: {
				System.out.println("Please enter the proper input");
			}
			}
		} while (b);

	}

	public static int addition() {

		System.out.println("Enter the first number");
		firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		secondnumber = s.nextInt();
		int sum = firstnumber + secondnumber;
		System.out.println("The sum of the two numbers is :" + sum);
		calculatoroperations();
		return sum;
	}

	public static int substraction() {
		System.out.println("Enter the first number");
		firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		secondnumber = s.nextInt();
		int sum = secondnumber - firstnumber;
		System.out.println("The differences between the two number is : " + sum);
		calculatoroperations();
		return sum;

	}

	public static int multiplication() {
		System.out.println("Enter the first number");
		firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		secondnumber = s.nextInt();

		int sum = firstnumber * secondnumber;
		System.out.println("THe multiplication between the two numbers is :" + sum);
		calculatoroperations();
		return sum;
	}

	public static int division() {
		System.out.println("Enter the first number");
		firstnumber = s.nextInt();
		System.out.println("Enter the second number");
		secondnumber = s.nextInt();

		int sum = secondnumber / firstnumber;
		System.out.println("The division of the two numbers is" + sum);
		calculatoroperations();
		return sum;
	}

	public static void powercalculation() {

		System.out.println("Enter the base value");
		int base = s.nextInt();
		System.out.println("Enter the exponent value");
		int exponent = s.nextInt();
		int sum=base;
		for (int i = 1; i <exponent; i++) {
			sum = sum * base;
		}
		System.out.println("The total base and their exponent value is : " + sum);
		calculatoroperations();
	}

}
