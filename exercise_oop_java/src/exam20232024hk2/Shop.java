package exam20232024hk2;

import java.util.Scanner;

public abstract class Shop {
    protected String tenGianHang;
    protected double dienTich;

    public Shop(){}

    public Shop(String tenGianHang, double dienTich){
        this.tenGianHang = tenGianHang;
        this.dienTich = dienTich;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten Gian Hang:");
        tenGianHang = sc.nextLine();

        System.out.print("Dien tich:");
        dienTich = sc.nextDouble();
    }
    public void xuatThongTin(){
        System.out.println("Ten Gian Hang: "+tenGianHang);
        System.out.println("Dien Tich" + dienTich);
    }

    public abstract double tinhTienThue();
}
