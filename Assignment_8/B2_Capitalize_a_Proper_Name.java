
package Lec07_String.Assignment_8;

import java.util.Scanner;
public class B2_Capitalize_a_Proper_Name {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String fullName = "  ngUYen vAn a ";
//        String[] new_fullName = fullName.split("");
//        new_fullName[0] = new_fullName[0].toUpperCase();
//        for (int i = 1; i < new_fullName.length; i++)
//        {
//            if (new_fullName[i - 1].equals(" "))
//            {
//                new_fullName[i] = new_fullName[i].toUpperCase();
//            } else 
//            {
//                new_fullName[i] = new_fullName[i].toLowerCase();
//            }
//        }
//        for (String item : new_fullName)
//        {
//            System.out.print(item);
//        }
//        System.out.println();
        // Cach 2:
        fullName = fullName.trim();
        String[] words = fullName.split(" ");
        StringBuilder result = new StringBuilder(); 
        for (String word : words)
        {
            String temp = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result.append(temp).append(" ");
        }
        
        System.out.print(result.toString().trim());
    }
}
