package practice;

import java.util.Scanner;

public class Even_Odd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is even or odd : ");
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+" is even.");
		}
		else
		{
			System.out.println(n+" is odd.");
		}
		
		sc.close();
	}
}
