package practice;

import java.util.Scanner;

public class Sum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto which you want the sum : ");
		int n = sc.nextInt();
		if(n>0)
		{
			int sum = 0;
			for(int i=1;i<=n;i++)
			{
				sum = sum + i;
			}
		
			System.out.println("Sum of first "+n+" natural number is : "+sum);
		}
		else
		{
			System.out.println("Enter the valid natural number.");
		}
		
		sc.close();
	}
}
