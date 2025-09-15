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
import java.util.Date;

public class Teacher extends Person {

    private String maGiaoVien;
    private String xepLoai;

    public Teacher(String maGiaoVien, String xepLoai, String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maGiaoVien = maGiaoVien;
        this.xepLoai = xepLoai;
    }

    public Teacher() {

    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }
    public String getXepLoai() {
        return maGiaoVien;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma giao vien: ");
        setMaGiaoVien(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print(", maGiaoVien=" + getMaGiaoVien() + ", xepLoai=" + xepLoai);
    }

    public void xepLoaiThiDua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon xep loai thi dua: \n1-Loai A, 2-loai B, 3-loai C");
        int danhGia = Integer.parseInt(scanner.nextLine());
        switch (danhGia) {
            case 1:
                System.out.println("Thi dua loai A");
                setXepLoai("Loai A");
                break;
            case 2:
                System.out.println("Thi dua loai B");
                setXepLoai("Loai B");
                break;
            case 3:
                System.out.println("Thi dua loai C");
                setXepLoai("Loai C");
                break;
            default:
                System.out.println("Chon sai");

        }
    }
}
