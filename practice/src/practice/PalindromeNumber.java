package practice;

import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is Palindrome number or not : ");
		int a = sc.nextInt();
		
		int b = a;
		int reverse = 0;
		int temp;
		
		
		while(a!=0)
		{
			temp = a % 10;
			reverse = reverse * 10 + temp;
			a = a/10;
		}
		if(reverse == b)
		{
			System.out.println("number is Palindrome number");
		}
		else
		{
			System.out.println("not Palindrome number");
		}
		
		
		sc.close();
	}
}
