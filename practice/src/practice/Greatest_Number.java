package practice;

import java.util.Scanner;

public class Greatest_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers to check which one is greatest : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println();
		
		if(a>b)
		{
			System.out.println(a + " is greatest");
		}
		else if(a==b)
		{
			System.out.println(a + " and "+ b + " are equal");
		}
		else 
		{
			System.out.println(b + " is greatest");
		}
		
		sc.close();
	}
}
