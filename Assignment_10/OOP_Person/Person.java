/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_AbstractClassAndInterface.Assignment_10.OOP_Person;

/**
 *
 * @author DELL
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class Person {

    private String hoVaTen;
    private Date ngaySinh;
    private String gioiTinh;
    private int cmnd;

    public Person(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public Person() {

    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void nhap() {
        boolean isValid = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap thong tin: ");
                System.out.print("Ho va ten: ");
                setHoVaTen(scanner.nextLine());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
                System.out.print("Ngay sinh(dd/MM/YYYY)");
                String ngaySinhString = scanner.nextLine();
                setNgaySinh(sdf.parse(ngaySinhString));
                System.out.print("Gioi tinh: ");
                setGioiTinh(scanner.nextLine());
                System.out.print("CMND: ");
                setCmnd(Integer.parseInt(scanner.nextLine()));
                isValid = true;
            } catch (ParseException ex) {
                System.out.println("Loi: " + ex.getMessage());
            }
        } while (!isValid);
    }

    public void xuat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.print("\nhoVaTen=" + getHoVaTen() + ", ngaySinh="
                + sdf.format(getNgaySinh()) + ", gioiTinh=" + getGioiTinh() + ", cmnd=" + getCmnd());
    }
}
