package Recursionassignment;

import java.util.Scanner;

public class Program1 {

	static Scanner s = new Scanner(System.in);
	static int num1 = 0;
	static int num2 = 1;
	static int num3;
	static int count =10;

	public static void fibonacciseries(int count) {
		if(count>0)
		{
			num3 = num1 + num2;
			System.out.print(num3 + " ");
		

				num1 = num2;
				num2 = num3;
				fibonacciseries(count-1);
		}
		
		}

	

	public static void main(String[] args) {
		
		System.out.print(num1 + " " + num2 + " ");
		fibonacciseries(count-2);
	}
}
