package Basicopen;

import java.util.Scanner;

public class Program18 {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("To find the area of the triangle");
		
		System.out.println("Enter the width of the triangle");
		double width=s.nextDouble();
		
		System.out.println("Enter the height of the triangle");
		
		double height=s.nextDouble();
		
		double area=(width*height)/2;
		
		System.out.println("The area of the triangle is :" + area);
	}
}
