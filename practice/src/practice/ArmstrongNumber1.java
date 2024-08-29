package practice;

import java.util.Scanner;

public class ArmstrongNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the range to check the Armstrong number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean flag = false;
        
        for(int i = a; i < b; i++) {
            int count = 0;
            int sum = 0;
            int num = i; // Use a separate variable to avoid modifying i
            
            // Count the number of digits
            while (num != 0) {
                count++;
                num = num / 10;
            }
            
            num = i; // Reset num to the original number
            
            // Calculate the sum of the power of digits
            while (num != 0) {
                int digit = num % 10;
                sum += (int) Math.pow(digit, count);
                num = num / 10;
            }
            
            // Check if the sum is equal to the original number
            if (sum == i) 
            {
            	System.out.println("Armstrong numbers between the range of " + a + " and " + b + " are : ");
                System.out.print(i + " ");
                flag = true;
            } 
        }
        if(!flag)
        {
        	System.out.println("There is no Armstrong number between the range of " + a + " and " + b);
        }
        
        sc.close();
    }
}
