package Basicopen;

import java.util.Scanner;

public class Program21 {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number=1;
		int number2=100;
		int count=0;
		for (int i = 2; i <=100; i++) {
			for (int j = 2; j <i; j++) {		
				if(i%j==0)
				{
					count++;
					System.out.println(i + " ");
				}
			}
			count=0;
		}
	}
}
