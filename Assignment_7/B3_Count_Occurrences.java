/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_Array.Assignment_7;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class B3_Count_Occurrences {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length's array :  ");
        int length = sc.nextInt();
        int value;
        int []numbers = new int[length];
        for (int i = 0; i < length; i++)
        {
            System.out.print("numbers[" + i + "] = " );
            value = sc.nextInt();
            numbers[i] = value;
        }
        
        System.out.print("Enter a number to find: ");
        int numberToFind = sc.nextInt();
        int count = 0;
        for (int i = 0; i < length; i++)
        {
            if (numbers[i] == numberToFind) count++;
        }
        
        System.out.println("Output:  The number " + numberToFind + " appears " + count + " times");
    }
}
