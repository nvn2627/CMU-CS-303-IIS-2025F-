package Lec06_Array.Assignment_7;

import java.util.Scanner;

public class B1_Find_the_Maximum_and_Minimum_Value {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length's array :  :  ");
        int length = sc.nextInt();
        int value;
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("numbers[" + i + "] = ");
            value = sc.nextInt();
            numbers[i] = value;
        }
        int max_value = numbers[0];
        for (int i = 0; i < length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                max_value = numbers[i + 1];
            }
        }

        System.out.println("Max value is " + max_value);
    }
}
