
package Lec03_Scanner.BT1_10;

import java.util.Scanner;

public class B7_NextLineToReadInput {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("The sentence is " + sentence);
    }
}
