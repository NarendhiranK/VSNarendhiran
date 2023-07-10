package Recursionassignment;

public class Program3 {

	static int number = 371;
	static int copy = number;
	static int sum = 0;

	public static void Palindromecheck(int number) {

		int r = 0;

		while (number > 0) {
			r = number % 10;
			sum = sum + r * r * r;
			Palindromecheck(number /= 10);

		}

	}

	public static void main(String[] args) {

		System.out.println(number);
		Palindromecheck(number);
		if (copy == sum) {
			System.out.println("The entered number is a palindrome number");
		} else {
			System.out.println("The entered number is not a palindrome number");
		}

	}

}
