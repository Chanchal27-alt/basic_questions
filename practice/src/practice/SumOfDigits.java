package practice;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number whose sum of digits you want : ");
		int a = sc.nextInt();
		
		int s = 0;
		
		while(a!=0)
		{
			s = s + (a%10);
			a = a/10;
		}
		System.out.println("Sum of digits of number is : " + s);
		
		sc.close();
	}
}
