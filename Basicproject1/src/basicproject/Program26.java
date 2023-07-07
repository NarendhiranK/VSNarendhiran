package Basicclosed;

public class Program26 {

	public static void main(String[] args) {

		long firstinvestment = 14000;
		System.out.println("THe investment value is : " + firstinvestment);
		long totalvalueinfirstyear = firstinvestment + ((firstinvestment * 40) / 100);
		System.out.println("The total value in the first value is : " + totalvalueinfirstyear);
		long secondyear = totalvalueinfirstyear -= 1500;
		System.out.println("THe total value in the second year is : " + secondyear);
		long thirdyear = secondyear + ((secondyear * 12) / 100);
		System.out.println("The total value in the third year is : " + thirdyear);

	}
}
