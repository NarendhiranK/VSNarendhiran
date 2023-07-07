package Basicclosed;

import java.util.Scanner;
public class Program15_1 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int input=s.nextInt();
		int copy=input;
		int sum=0;
		int r;
		while(input>0)
		{
			r=input%10;
			sum=sum+ r*r*r;
			input/=10;
		}
		String res=(sum==copy)?"Amstrong":"Not a Armstrong";
		System.out.println(res);
	}
}
