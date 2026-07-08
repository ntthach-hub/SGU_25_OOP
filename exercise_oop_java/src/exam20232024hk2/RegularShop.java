package exam20232024hk2;

import java.util.Scanner;

public class RegularShop extends Shop{
    private double hesophuthu;

    public RegularShop(){}

    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("He So Phu Thu:");
        hesophuthu = sc.nextDouble();
    }

    @Override
    public double tinhTienThue() {
        double tientheoDT;
        if (dienTich > 50)
            tientheoDT = dienTich * 5000;
        else
            tientheoDT = dienTich * 3000;

        double phuPhi = hesophuthu * tientheoDT;
        return tientheoDT + phuPhi;
    }
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("He so phu thu: " + hesophuthu);
        System.out.println("Tien thue: " + tinhTienThue());
    }
}
