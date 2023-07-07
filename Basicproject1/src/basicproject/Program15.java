package Basicclosed;

public class Program15 {

	public static void main(String[] args) {
		System.out.print("The prime numbers between 1 to 100 are");
		int num1 = 1;
		int num2 = 100;
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}

			}
			if (count == 0) {
				System.out.print(i + " ");
			}
			count = 0;
		}
	}
}
