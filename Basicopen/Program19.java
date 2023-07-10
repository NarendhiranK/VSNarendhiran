package Basicopen;

import java.util.Scanner;

public class Program19 {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the radius");
		
		double radius=s.nextDouble();
		
		double area=Math.PI*(radius*radius);
		
		System.out.println("The area of the circle is :" + area);
		
		double circumference=Math.PI*2*radius;
		
		System.out.println("The circumference of the circle is :" + circumference);
	}
}
