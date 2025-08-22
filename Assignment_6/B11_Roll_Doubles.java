
package Lec5_Loop.Assignment_5;

import java.util.Random;
public class B11_Roll_Doubles {
    public static void main(String[] args)
    {
       Random rd = new Random();
       int dice1, dice2;
       int count = 0;
       do 
       {
         dice1 = rd.nextInt(6) + 1;
         dice2 = rd.nextInt(6) + 1;
         count++;
         System.out.println("Rool " + count + " - " + dice1 + " - " + dice2);
       } while(dice1 != dice2);
       
       System.out.println("Both dice matched after " + count + " rolls!");
    }
}
