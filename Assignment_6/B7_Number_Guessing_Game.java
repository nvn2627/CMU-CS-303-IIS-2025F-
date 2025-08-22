
package Lec5_Loop.Assignment_6;

import java.util.Scanner;
import java.util.Random;
public class B7_Number_Guessing_Game {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int secret = rd.nextInt(100) + 1;
        System.out.println(secret);
        int guess;
        do 
        {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            if (guess < secret) System.out.println("Your number is lower than the secret number");
            else if (guess > secret) System.out.println("Your number is higher than the secret number");
        } while(guess > secret || guess < secret);

        System.out.println("Congratulations! You guessed correctly!");
    }
}
