
package Lec03_Scanner.BT1_10;

import java.util.Scanner;


public class B8_Multiple_Inputs {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        while(scanner.hasNext())
        {
            System.out.println(scanner.next());
        }
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.println("Your name: " + " " + word1 + " " + word2 + " " + word3);
    }
}
