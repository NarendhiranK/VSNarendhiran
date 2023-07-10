package Basicopen;

import java.util.Scanner;

public class Program17 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("To find the area of the square");

		System.out.println("Enter the side of the square");

		double side = s.nextDouble();

		double Areaofthesquare = side * side;

		System.out.println("The area of the square is :" + Areaofthesquare);
	}
}
