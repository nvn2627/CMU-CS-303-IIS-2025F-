
package Lec06_Array.Assignment_7;

import java.util.Scanner;

public class B9_Swap_Two_Elements_in_an_Array {

    public static void output_arr(int[] numbers)
    {
        for (int item:numbers)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void swap(int[] numbers, int index1, int index2)
    {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 2, 1, 4, 5};
        System.out.print("index1: ");
        int index1 = sc.nextInt();
       
        System.out.print("index1: ");
        int index2 = sc.nextInt();
        
        swap(numbers,index1, index2);
        
        output_arr(numbers);
    }
    
    
}
