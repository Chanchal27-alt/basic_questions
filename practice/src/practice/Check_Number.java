package practice;

import java.util.Scanner;

public class Check_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is positive or negative : ");
		int n = sc.nextInt();
		
		if(n>0)
		{
			System.out.println(n+" is positive number.");
		}
		else if(n<0)
		{
			System.out.println(n+" is negative number.");
		}
		else
		{
			System.out.println(n + " is zero.");
		}
		
		sc.close();
	}
}
