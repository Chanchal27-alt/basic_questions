package practice;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to check whether it is Armstrong number or not : ");
		int a = sc.nextInt();
		
		int count = 0;
		int b = a;
		int temp;
		int sum = 0;
		
		while(a!=0)
		{
			a = a/10;
			count++;
		}
		
		a=b;
		
		while(a!=0)
		{
			temp = a % 10;
			sum = (int) (sum + Math.pow(temp, count));
			a = a/10;
		}
		
		if(sum==b)
		{
			System.out.println("number is Armstrong Number");
		}
		else
		{
			System.out.println("not Armstrong Number");
		}
		
		sc.close();
	}
}
