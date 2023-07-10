package Recursionassignment;

public class Program2 {


	static int num = 6;

	public static long Factorial(int num) {
		if (num >= 1) {
			return num * Factorial(num - 1);
		}

		else {
			return 1;
		}

	}

	public static void main(String[] args) {

		long factorial = Factorial(num);

		System.out.println("The factorial of the given number is :" + num + "is " + factorial);

	}
}
