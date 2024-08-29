package practice;

import java.util.Scanner;

public class Sum1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number from which you want to have sum : ");
		int i = sc.nextInt();
		
		System.out.println("Enter the number of natural numbers upto which you want to have sum : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int j=1; j<=n; j++)
		{
			sum = sum + i;
			i++;
		}
		
		System.out.println("Sum of "+ n + " natural numbers is : " + sum);
		
		sc.close();
	}
}
