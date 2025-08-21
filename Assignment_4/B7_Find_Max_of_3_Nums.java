
package Lec04_Condition_Expression.Assignment_4;

import java.util.Scanner;
public class B7_Find_Max_of_3_Nums {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("a = ");
       int a = scanner.nextInt();
       System.out.print("b = ");
       int b = scanner.nextInt();
       System.out.print("c = ");
       int c = scanner.nextInt();
       
       if (a > b && a > c)
           System.out.println("Max is " + a);
       else if (b > a && b > c)
           System.out.println("Max is " + b);
       else if (c > a && c > b)
           System.out.println("Max is " + c);
    }
}
