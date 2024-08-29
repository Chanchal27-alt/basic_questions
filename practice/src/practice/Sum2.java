package practice;

import java.util.Scanner;

public class Sum2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers to find the sum of numbers between that range excluding the given numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		
		if(a<b)
		{
			for(int i = a+1;i<b;i++)
			{
				sum = sum +i;
			}
		}
		
		System.out.println("Sum of the numbers between the range of "+ a +" and "+ b + " is = "+ sum);
		
		sc.close();
	}
}
