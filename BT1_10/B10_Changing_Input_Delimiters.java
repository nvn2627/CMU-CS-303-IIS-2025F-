
package Lec03_Scanner.BT1_10;

import java.util.Scanner;


public class B10_Changing_Input_Delimiters {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("##|\n");
        System.out.print("Enter words separated by '##': ");
        while(scanner.hasNext())
        {
            
           System.out.println(scanner.next());
        }
    }
}
