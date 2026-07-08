package Xe;

import java.util.Scanner;

public class testXe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong xe: ");
        int n = sc.nextInt();

        DSXe ds = new DSXe(n);

        for(int i = 0; i < n; i++){
            ds.them();
        }

        System.out.println("====Danh sach xe====");
        ds.xuat();

        System.out.println("Tong tien qua tram: " + ds.tongTienQuaTram());
    }
}
