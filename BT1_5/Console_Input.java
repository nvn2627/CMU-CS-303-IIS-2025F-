package Lec03_Scanner;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Console_Input {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old");
    }
}