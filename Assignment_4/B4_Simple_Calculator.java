
package Lec04_Condition_Expression.Assignment_4;

import java.util.Scanner;
public class B4_Simple_Calculator {
     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int first_num = scanner.nextInt();
        
        System.out.print("Second number: ");
        int second_num = scanner.nextInt();
        
        System.out.print("Operator: ");
        String operator = scanner.next();
        
        switch(operator)
        {
            case "+":
                System.out.println(first_num + " + " + second_num + " = " + (first_num + second_num));
                break;
            case "-":
                System.out.println(first_num + " - " + second_num + " = " + (first_num - second_num));
                break; 
            case "*":
                System.out.println(first_num + " * " + second_num + " = " + (first_num * second_num));
                break; 
            case "/":
                while(second_num == 0)
                {
                    System.out.println("The second must be different from 0! "); 
                    System.out.print("Second number: ");
                    second_num = scanner.nextInt();
                }
                System.out.println(first_num + " / " + second_num + " = " + ((float)first_num / second_num));
                break;  
        }
     }
}
