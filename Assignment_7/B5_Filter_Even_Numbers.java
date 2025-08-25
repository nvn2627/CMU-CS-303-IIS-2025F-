/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_Array.Assignment_7;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Scanner;
public class B5_Filter_Even_Numbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> evenList = new ArrayList<>();
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
        
        for (int i = 0; i < length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                evenList.add(numbers[i]);
            }
        }
        System.out.print("Even numbers in the array are: ");
        
        for (Integer item : evenList)
        {
            System.out.print(item + " ");
        }
        
    }
}
