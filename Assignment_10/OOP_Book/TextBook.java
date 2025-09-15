/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Book;

import java.util.Scanner;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("subject: ");
        setSubject(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.print(", subject: " + getSubject());
        System.out.println();
    }

    @Override
    public void updateBook() {
        this.input();
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + getBasePrice() * 0.1;
    }
}
