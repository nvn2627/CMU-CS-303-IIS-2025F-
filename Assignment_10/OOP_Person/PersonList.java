/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person;

/**
 *
 * @author DELL
 */
import Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person.Person;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> danhSachNguoi = new ArrayList<>();

    void input(Person p) {

        danhSachNguoi.add(p);
    }

    void output() {
        if (danhSachNguoi.size() == 0) {
            System.out.println("Danh sach rong!");
        } else {
            for (int i = 0; i < danhSachNguoi.size(); i++) {
                Person p = danhSachNguoi.get(i);
                p.xuat();
            }
        }
    }

    void tim(int index) {
        danhSachNguoi.get(index).xuat();
    }

    void xoa(int index) {
        danhSachNguoi.remove(index);
    }
}
