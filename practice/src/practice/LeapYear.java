package practice;

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year to check whether it is Leap year or not : ");
		int year = sc.nextInt();
		
		System.out.println();
		
		if(year % 4 == 0)
		{
			System.out.println(year + " is Leap year.");
		}
		else
		{
			System.out.println(year + " is not Leap year.");
		}
		
		sc.close();
	}
}
