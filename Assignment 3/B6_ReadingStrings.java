
package Lec03_Scanner.BT1_10;

import java.util.Scanner;

public class B6_ReadingStrings {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your fullname: ");
        String fullName = scanner.nextLine();
        System.out.println("Your name: " + fullName);
    }
}
