
package Lec5_Loop.Assignment_5;

import java.util.Scanner;
public class B12_Prime_Checker {
    public static boolean is_prime(int num)
    {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(2); i++)
        {
            if (num % i == 0) return false;
            
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int num = sc.nextInt();
        if (is_prime(num))
        {
            System.out.println(num + " is a prime number");
        } else System.out.println(num + " is not a prime number");
    }
}

