/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person;

/**
 *
 * @author DELL
 */
import Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person.PersonList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList list = new PersonList();
        int tiepTuc = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap thong tin (Sinh vien) / Giao vien");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Tim nguoi");
            System.out.println("4. Xoa nguoi");
            System.out.print("Chon chuc nang: ");

            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 0:
                    tiepTuc = 0;
                    break;
                case 1:
                    System.out.println("Them moi mot nguoi vao danh sach");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Nhap ai? 1-Sinh vien, 2-Giao vien ");
                    int chon = Integer.parseInt(scanner.nextLine());
                    if (chon == 1) {
                        Student sinhVien = new Student();
                        sinhVien.nhap();
                        sinhVien.danhGiaRenLuyen();
                        list.input(sinhVien);
                    } else if (chon == 2) {
                        Teacher giaoVien = new Teacher();
                        giaoVien.nhap();
                        giaoVien.xepLoaiThiDua();
                        list.input(giaoVien);
                    } else {
                        System.out.println("Nhap sai");
                    }
                    System.out.print(("Them moi thanh cong."));
                    break;
                case 2:
                    list.output();
                    break;
                case 3:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhap index can tim: ");
                    list.tim(sc1.nextInt());
                    break;
                case 4:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Nhap index xoa ");
                    list.xoa(sc2.nextInt());
                    System.out.println("Xoa thanh cong");
                    break;
                default:
                    System.out.println("Nhap sai");
            }
            if (tiepTuc != 0) {
                Scanner sc = new Scanner(System.in);
                System.out.print("\nTiep tuc? 1-co, 0-khong");
                tiepTuc = Integer.parseInt(scanner.nextLine());
            }

        } while (tiepTuc != 0);
    }
}
