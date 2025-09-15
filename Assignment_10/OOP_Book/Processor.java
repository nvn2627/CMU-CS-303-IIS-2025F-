/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Book;

import Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person.PersonList;
import Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person.Student;
import Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person.Teacher;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Processor {

    public static void main(String[] args) {
        BookList list = new BookList();
        int tiepTuc = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap thong tin (TextBook) / ReferenceBook");
            System.out.println("2. Hien thi tat ca sach");
            System.out.println("3. Tim sach theo id");
            System.out.println("4. Tim sach co gia cao nhat");
            System.out.println("5. Tinh tong sach hien co");
            System.out.println("6. Xoa sach theo id");
            System.out.println("7. Sua thong tin sach theo id");
            System.out.print("Chon chuc nang: ");

            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 0:
                    tiepTuc = 0;
                    break;
                case 1:
                    System.out.println("Them sach: ");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("1.(TextBook) / 2.(ReferenceBook) ");
                    int chon = Integer.parseInt(scanner.nextLine());
                    if (chon == 1) {
                        TextBook txtBook = new TextBook();
                        list.inputList(txtBook);
                    } else if (chon == 2) {
                        ReferenceBook refBook = new ReferenceBook();
                        list.inputList(refBook);
                    } else {
                        System.out.println("Nhap sai");
                    }
                    System.out.print(("Them moi thanh cong."));
                    break;
                case 2:
                    list.outputList();
                    break;
                case 3:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhap id can tim: ");
                    list.findBookById(sc1.nextLine());
                    break;
                case 4:
                    System.out.println("Sach co gia cao nhat la: ");
                    list.findMostExp();
                    break;
                case 5:
                    System.out.println("Tong sach hien co la: " + list.countBooks());
                    break;
                case 6:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Nhap id sach can xoa: ");
                    list.deleteBook(sc2.nextLine());
                    System.out.println("Xoa thanh cong");
                    break;
                case 7:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Nhap id sach can chinh sua: ");
                    list.updateBook(sc3.nextLine());
                    System.out.println("Cap nhat thanh cong.");
                    break;
                default:
                    System.out.println("Nhap sai");
            }
            if (tiepTuc != 0) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Tiep tuc? 1-co, 0-khong ");
                tiepTuc = Integer.parseInt(scanner.nextLine());
            }

        } while (tiepTuc != 0);
    }

}
