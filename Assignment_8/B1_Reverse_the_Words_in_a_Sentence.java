
package Lec07_String.Assignment_8;

import java.util.Scanner;
public class B1_Reverse_the_Words_in_a_Sentence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
