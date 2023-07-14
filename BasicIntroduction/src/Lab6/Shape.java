package Lab6;

import java.util.Scanner;

abstract class Shape {

	abstract public void calculateArea();

	static Scanner s = new Scanner(System.in);
	double area;
}

class Rectangle extends Shape {

	@Override
	public void calculateArea() {
		System.out.println("To find the area of the rectangle");
		System.out.println("Enter the length of the rectangle");
		int length = s.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int breadth = s.nextInt();
		area = length * breadth;
		System.out.println("THe area of the rectangle is  : " + area);

	}

}

class Circle extends Shape {

	@Override
	public void calculateArea() {
		System.out.println("To find the area of the circle");
		System.out.println("Enter the radius of the circle");
		int radius = s.nextInt();
		area = Math.PI * (radius * radius);
		System.out.println("The area of the circle is : " + area);

	}

}
