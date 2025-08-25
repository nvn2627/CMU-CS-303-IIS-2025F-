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
import java.util.ArrayList;
public class B4_To_Do_List_Management {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add a new task.");
        System.out.println("2. View all tasks.");
        System.out.println("3. Remove a task by its position (index)");
        ArrayList<String> list = new ArrayList<>();
        int index_task = sc.nextInt();
        if (index_task == 1) {
            System.out.print("New task: ");
            String task = sc.nextLine();
            list.add(task);
        } else if (index_task == 2) {
            for (String task : list) {
                System.out.print(task);
            }
        } else if (index_task == 3)
        {
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            list.remove(index);
        }
    }
}
