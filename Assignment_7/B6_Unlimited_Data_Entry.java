/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_Array.Assignment_7;

import java.util.Scanner;
import java.util.ArrayList;
public class B6_Unlimited_Data_Entry {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num, sum = 0;
        System.out.print("Input: ");
        num = sc.nextInt();
        while(num != -1)
        {
            list.add(num);
            num = sc.nextInt();
        }
        
        for (Integer item : list)
        {
            sum += item;
        }
        System.out.println("The sum is  " + sum);
    }
}
