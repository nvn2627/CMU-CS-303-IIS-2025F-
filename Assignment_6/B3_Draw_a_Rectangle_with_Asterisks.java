
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
public class B3_Draw_a_Rectangle_with_Asterisks {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("height = ");
        int height = sc.nextInt();
        System.out.print("width = ");
        int width = sc.nextInt();
        
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
