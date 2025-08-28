
package Lec06_Array.Assignment_7;

import java.util.Scanner;
public class B10_Concatenate_Two_Arrays {
    public static void merge(int[] arr1, int[] arr2, int[] new_arr)
    {
        int i;
        for (i = 0; i < arr1.length; i++)
        {
            new_arr[i] = arr1[i];
        }
        
        for (int j = 0; j < arr2.length; j++)
        {
            new_arr[j + i] = arr2[j];
        }
    }
    public static void output_arr(int[] numbers)
    {
        for (int item:numbers)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] new_arr = new int[arr1.length + arr2.length];
        System.out.println("Sau khi merge: ");
        merge(arr1, arr2, new_arr);
        output_arr(new_arr);
    }
}
