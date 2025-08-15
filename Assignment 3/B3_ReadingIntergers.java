
package Lec03_Scanner.BT1_10;

import java.util.Scanner;


public class B3_ReadingIntergers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
    }
}
