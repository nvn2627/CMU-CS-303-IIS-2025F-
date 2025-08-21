
package Lec04_Condition_Expression.Assignment_4;

import java.util.Scanner;
public class B2_Age_Group {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 12)
        {
            System.out.println("Child");  
        } else if (age >= 13 && age <= 19){
            System.out.println("Teenager");  
        } else if (age >= 20 && age <= 59){
            System.out.println("Adult");  
        } else if (age >= 60){
            System.out.println("Senior");  
        }
    }
}
