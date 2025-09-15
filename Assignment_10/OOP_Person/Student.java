/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person;

import Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person.Person;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student extends Person {

    private String maSinhVien;
    private String renLuyen;

    public Student(String maSinhVien, String renLuyen, String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public Student() {

    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maGiaoVien) {
        this.maSinhVien = maGiaoVien;
    }
    
    public String getRenLuyen()
    {
        return renLuyen;
    }
    
    public void setRenLuyen(String renLuyen)
    {
        this.renLuyen = renLuyen;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        setMaSinhVien(scanner.nextLine());
        System.out.print("Ren luyen: ");
        setRenLuyen(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print(", maSinhVien=" + getMaSinhVien() + ", renLuyen= " + renLuyen);
    }

    public void danhGiaRenLuyen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh gia ren luyen: \n1-gioi, 2-kha B, 3-trung binh, 4-yeu");
        int danhGia = Integer.parseInt(scanner.nextLine());
        switch (danhGia) {
            case 1:
                System.out.println("gioi");
                setRenLuyen("gioi");
                break;
            case 2:
                System.out.println("kha");
                setRenLuyen("kha");
                break;
            case 3:
                System.out.println("trung binh");
                setRenLuyen("trungbinh");
                break;
            case 4:
                System.out.println("yeu");
                setRenLuyen("yeu");
                break;
            default:
                System.out.println("Chon sai");

        }
    }
}
