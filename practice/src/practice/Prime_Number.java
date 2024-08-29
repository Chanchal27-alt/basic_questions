package practice;

import java.util.Scanner;

public class Prime_Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to check whether it is prime or not : ");
		int n = sc.nextInt();
		
		System.out.println();
		boolean isprime = true;
		
		if(n>0)
		{
			if(n==1)
			{
				System.out.println(n + " is neither prime nor composite.");
			}
			else if(n==2)
			{
				System.out.println(n + " is prime number.");
			}
			else
			{
				for (int i = 2; i < n; i++)
		        {
		            if (n % i == 0)
		            {
		               isprime = false;
		               System.out.println(n + " is not prime number.");
		                  break;
		            }
		        }
				if(isprime)
				{
					System.out.println(n + " is prime number.");
				}
			}
		}
		else if(n<0)
		{
			System.out.println(n + " is negative number, please enter positive number.");
		}
		else
		{
			System.out.println(n + " is neither prime nor composite.");
		}
		
		sc.close();
	}
}
