
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
public class B8_Input_Validation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number from 1 to 10: ");
        do 
        {
            
            n = sc.nextInt();
            if (n < 1 || n > 10)
            {
                System.out.print("Invalid number, please try again: ");
            }
        } while(n < 1 || n > 10);
        System.out.println("You entered the number: " + n);
    }
}
