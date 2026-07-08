package exam20232024hk2;

import java.util.Scanner;

public class FoodShop extends Shop{
    private double chiphiantoanTP;
    public FoodShop(){
    }
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();

        Scanner sc = new Scanner(System.in);
        System.out.print("Chi phi an toan TP: ");
        chiphiantoanTP = sc.nextDouble();
    }
    @Override
    public double tinhTienThue(){
        double tientheoDT;
        if (dienTich > 30)
            tientheoDT = dienTich * 8000;
        else
            tientheoDT = dienTich * 6000;

        return tientheoDT + chiphiantoanTP;
    }

    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.print("Chi pphi an toan thuc pham: " + chiphiantoanTP);
        System.out.print("tien Thue: "+ tinhTienThue());
    }
}
