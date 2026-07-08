package Xe;

import java.util.Scanner;

public class DSXe {
    private Xe[] ds;
    private int n;

    public DSXe(int max) {
        ds = new Xe[max];
        n = 0;
    }

    public void them() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Xe buyt");
        System.out.println("2. Xe tai");
        System.out.print("Chon: ");
        int chon = sc.nextInt();
        sc.nextLine();

        if (chon == 1)
            ds[n] = new XeBuyt();
        else
            ds[n] = new xeTai();

        ds[n].nhap();
        n++;
    }

    public double tongTienQuaTram() {
        double tong = 0;

        for (int i = 0; i < n; i++) {
            tong += ds[i].TinhTienQuaTram();
        }

        return tong;
    }

    public void xuat() {
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
            System.out.println("----------------");
        }
    }
}