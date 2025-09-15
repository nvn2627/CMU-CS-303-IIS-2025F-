/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Book;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("publisher: ");
        setPublisher(sc.nextLine()); 
    }

    @Override
    public void output() {
        super.output();
        System.out.print(", publisher: " + getPublisher());
        System.out.println();
    }

    @Override
    public void updateBook() {
        this.input();
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + getBasePrice() * 0.2;
    }
}
