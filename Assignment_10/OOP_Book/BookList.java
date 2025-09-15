/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Book;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    public ArrayList<Book> list = new ArrayList<>();

    public void inputList(Book b) {
        b.input();
        list.add(b);
    }

    public void outputList() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
        }
    }

    public void findBookById(String id) {
        for (Book item : list) {
            if (item.getId().equals(id)) {
                item.output();
                break;
            }
        }
    }

    public void updateBook(String id) {
        for (Book item : list) {
            if (item.getId().equals(id)) {
                item.input();
                return;
            }
        }
        System.out.println("Not found book with id: " + id);
    }

    public void deleteBook(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
            }
        }
    }

    public void findMostExp() {
        double mostExp = list.get(0).calculatePrice();
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            double price = list.get(i).calculatePrice();
            if (price > mostExp) {
                mostExp = price;
                index = i;
            }
        }
        list.get(index).output();
    }

    public int countBooks() {
        return list.size();
    }

}
