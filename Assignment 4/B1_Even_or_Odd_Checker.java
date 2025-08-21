
package Lec04_Condition_Expression;

import java.util.Scanner;
public class B1_Even_or_Odd_Checker {
    public static boolean check_even(int num)
    {
        if (num % 2 == 0) return true;
        else return false;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (check_even(num))
        {
            System.out.println(num + " is a even number.");
        } else 
        {
            System.out.println(num + " is an odd number.");
        }
    }
}
