
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
public class B1_Caculate_Sum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextByte();
        int count = 0;
        for (int i = 1; i <= n; i++)
        {
            count += i;
        }
        
        System.out.println("The sum of numbers from 1 to 100 is: " + count);
    }
}
