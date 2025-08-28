/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_Array.Assignment_7;

import java.util.Scanner;
import java.util.ArrayList;

public class B7_Remove_Duplicate_Elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> new_list = new ArrayList<>();
        int num;
        System.out.print("Input: ");
        num = sc.nextInt();
        while (num != -1) {
            list.add(num);
            num = sc.nextInt();
        }
        
        
        for (Integer item:list)
        {
            new_list.add(item);
        }
        
        for (int i = 0; i < new_list.size() - 1; i++)
        {
            for (int j = i + 1; j < new_list.size(); j++)
            {
                if (new_list.get(i) == new_list.get(j))
                {
                    new_list.remove(j);
                    j--;
                }
            }
        }
        
        for (Integer item:new_list)
        {
            System.out.print(item + " ");
        }
        
    }
}
