package Recursionassignment;

public class Program4 {

	public static int sum_of_digit(int n) {
		if (n == 0)
			return 0;
		else
		return (n % 10 + sum_of_digit(n / 10));
	}

	public static void main(String args[]) {
		int num = 12345;
		int result = sum_of_digit(num);
		System.out.println("Sum of digits in " + num + " is " + result);
	}
}
