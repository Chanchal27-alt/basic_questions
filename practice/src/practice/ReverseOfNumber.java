package practice;

import java.util.Scanner;

public class ReverseOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number whose reverse you want : ");
		int a = sc.nextInt();
		
		int temp;
		int reverse = 0;
		
		while(a!=0)
		{
			temp = a % 10;
			reverse = reverse * 10 + temp;
			a = a/10;
		}
		System.out.println("Reverse number is : " + reverse);
		
		sc.close();
		
	}
}
