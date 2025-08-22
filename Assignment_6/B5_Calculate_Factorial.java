
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
public class B5_Calculate_Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        System.out.println("The factorial of 5 is: " + result);
    }
}
