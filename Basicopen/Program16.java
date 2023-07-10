package Basicopen;

import java.util.Scanner;

public class Program16 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the length of rectangle");
		double length = s.nextDouble();

		System.out.println("Enter the breadth of the rectangle");

		double breadth = s.nextDouble();

		double areaoftherectangle = length * breadth;

		System.out.println("The area of the rectangle is  :" + areaoftherectangle);

	}
}
