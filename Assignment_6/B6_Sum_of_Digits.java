
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
public class B6_Sum_of_Digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int result = 0;
        for (int i = n; i >= 1; i /= 10)
        {
            result += i % 10;
        }
        System.out.println("The sum of the digits is: " + result);
    }
}
