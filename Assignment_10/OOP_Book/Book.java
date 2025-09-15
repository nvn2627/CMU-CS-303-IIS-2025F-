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
public abstract class Book implements IBook{
    private String id;
    private String title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        setId(sc.nextLine());
        System.out.print("title: ");
        setTitle(sc.nextLine());
        System.out.print("basePrice: ");
        setBasePrice(sc.nextDouble());
    }
    @Override
    public void output()
    {
        System.out.println("id: " + getId() + ", title: " + getTitle()+  ", bascePrice: " + getBasePrice());
    }
    @Override
    public void updateBook() {
        this.input();
    }
    @Override
    public abstract double calculatePrice();
}
