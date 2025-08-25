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
public class B2_Reverse_an_Array {
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
        
        for (int i = 0; i < length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
        }
        
        System.out.print("Output: ");
        
        for (int i = 0; i < length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        
    }
}
