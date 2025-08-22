
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
public class B4_Draw_a_Right_Angled_Triangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("h = ");
        int h = sc.nextInt();
        
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
