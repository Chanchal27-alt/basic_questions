package practice;

import java.util.Scanner;

public class Prime_Number1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the range to count number of prime numbers within it :  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println();
		int count = 0;
		
		if(a<b)
		{
			for(int i = (a+1); i<b ;i++)
			{
				boolean isprime = true;
				
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						isprime = false;
					}
				}
				if(isprime)
				{
					count++;
					System.out.print(i + " ");
				}
			}
			System.out.println();
			System.out.println(count + " prime numbers are present within the range of "+ a + " and " + b);
		}
		else
		{
			System.out.println("value of a should be less than b. ");
		}
		
		sc.close();
	}
}
