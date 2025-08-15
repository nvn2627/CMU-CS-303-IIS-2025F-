/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec03_Scanner;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ReadingBooleans {
     public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        boolean a = scanner.nextBoolean();
        
        System.out.println("Result:  " + a);
    }
}
