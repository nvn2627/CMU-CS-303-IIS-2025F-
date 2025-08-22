
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
public class B9_Calculate_Average_Until_0_is_Entered {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a number(enter 0 to stop): ");
        int num = sc.nextInt();
        float total = num;
        while(num != 0)
        {
            System.out.print("Enter a number(enter 0 to stop): ");
            num = sc.nextInt();
            total += num;
            count++;
        }
        System.out.println(count);
        
        System.out.println(total);
        System.out.println("The average is " + (total / count));
    }
}
