package Lec04_Condition_Expression;

import java.util.Scanner;

public class B10_Triangle_Classifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            if (a == b && a == c) {
                System.out.println("This is an equilateral triangle");
            } else if (a == b || a == c || b == c) {
                System.out.println("This is an isosceles triangle");
            } else if ((a != b) && (a != c) && (b != c)) {
                System.out.println("This is a scalene triangle");
            }
        } else {
            System.out.println("These sides cannot form a triangle");
        }

    }
}
