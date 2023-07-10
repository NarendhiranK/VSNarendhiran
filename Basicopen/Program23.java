package Basicopen;

import java.util.Arrays;

public class Program23 {

	public static void main(String[] args) {
		
		int [] a= {10,20,30,40,50,60,70,80};
		System.out.println("The input array is :" + Arrays.toString(a));
		int sum=0;
		for (int i : a) {
			
			sum=sum+i;
		}
		System.out.println("The sum of the elements in the array is : " + sum);
	}
}
