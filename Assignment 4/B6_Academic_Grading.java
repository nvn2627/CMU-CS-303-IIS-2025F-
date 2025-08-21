
package Lec04_Condition_Expression;

import java.util.Scanner;
public class B6_Academic_Grading {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your average score: ");
       float av_score = scanner.nextFloat();
       if (av_score >= 9 && av_score <= 10)
       {
           System.out.println("Excenllent");  
       } else if (av_score >= 8 && av_score <= 9){
           System.out.println("Good");  
       } else if (av_score >= 6.5 && av_score <= 7.9){
           System.out.println("Fair");  
       } else if (av_score < 5){
           System.out.println("Fail");  
       }
    }
}
