
package Lec04_Condition_Expression;

import java.util.Scanner;
public class B9_Absolute_Value_with_Ternary_Operator {
     public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("x = ");
       int x = scanner.nextInt();
       
       if (x >= 0)
       {
           System.out.println("The absolute value is " + x);
       } else 
       {
           System.out.println("The absolute value is " + (x * (-1)));
       }
    }
}
