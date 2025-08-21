
package Lec04_Condition_Expression;

import java.util.Scanner;
public class B3_Leap_Year_Checker {
     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(2024 + " is a leap year");
        } else System.out.println(2024 + " is not a leap year");
     }
}
