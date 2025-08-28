
package Lec06_Array.Assignment_7;

import java.util.Scanner;
import java.util.Arrays;
public class B8_Sort_and_Search {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Input: ");
        int value;
        for (int i = 0; i < 5; i++)
        {
            value = sc.nextInt();
            arr[i] = value;
        }
        
        Arrays.sort(arr);
        
        System.out.print("Output after sorting: ");
        for (Integer item : arr)
        {
            System.out.print(item + " ");
        }
        
        System.out.print("\nNumber to find: ");
        int numberToFind = sc.nextInt();
        int index = -1;
        for (int i = 0; i < 5; i++)
        {
            if (arr[i] == numberToFind)
            {
                index = i;
            }
        }
        
        if (index == -1) System.out.println("Not found!");
        else System.out.print("The number " +  numberToFind + " was found at index " + index);
    }
}
