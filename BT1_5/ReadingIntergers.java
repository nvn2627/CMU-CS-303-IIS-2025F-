
package Lec03_Scanner;

import java.util.Scanner;


public class ReadingIntergers {
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
