
package Lec04_Condition_Expression.Assignment_4;

import java.util.Scanner;
public class B8_Quadrant_Determination {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("x = ");
       float x = scanner.nextFloat();
       System.out.print("y = ");
       float y = scanner.nextFloat();
       
       if (x > 0 && y > 0) System.out.println("The point is in the 1nd quadrant");
       else if (x < 0 && y > 0) System.out.println("The point is in the 2nd quadrant");
       else if (x < 0 && y < 0) System.out.println("The point is in the 3nd quadrant");
       else if (x > 0 && y < 0) System.out.println("The point is in the 4nd quadrant");
       else System.out.println("The point is in on axis.");
    }
}
