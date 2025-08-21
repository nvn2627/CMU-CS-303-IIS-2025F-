
package Lec04_Condition_Expression.Assignment_4;
import java.util.Scanner;

public class B11_Quadratic_Equation_Solver {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("a = ");
       double a = sc.nextDouble();
       System.out.print("b = ");
       double b = sc.nextDouble();
       System.out.print("c = ");
       double c = sc.nextDouble();
       // ax^2 + bx + c
       if (a == 0)
       {
           if (b == 0)
           {
               if (c == 0)
                   System.out.println("Phuong trinh vo so nghiem");
               else System.out.println("Phuong trinh vo nghiem");
           } else 
           {
               System.out.println("Phuong trinh co nghiem la x = " + (-c / b));
           }
       } else 
       {
           double delta = b * b - 4 * a * c;
           if (delta < 0)
           {
               System.out.println("Phuong trinh vo nghiem");
           } else if (delta == 0)
               System.out.println("Phuong trinh co nghiem kep x = " + (-b / (2 * a)));
           else 
           {
               double x1 = (-b + Math.sqrt(delta))/ (2 * a);
               double x2 = (-b - Math.sqrt(delta)) / (2 * a);
               System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + ", x2 = " + x2);
           }
       }
    }
}
