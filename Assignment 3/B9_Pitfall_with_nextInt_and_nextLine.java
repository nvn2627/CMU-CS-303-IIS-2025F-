
package Lec03_Scanner.BT1_10;

import java.util.Scanner;


public class B9_Pitfall_with_nextInt_and_nextLine {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your age is " + age + " and Your name is " + name);
    }
}
