package Xe;

import java.util.Scanner;

public class xeTai extends Xe{
    private double trongTai;
    public xeTai(){}
    public xeTai(String bienso, String mauXe, String nhanHieu, double trongTai){
        super(bienso, mauXe, nhanHieu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Trong Tai(Tan): ");
        trongTai = sc.nextDouble();
        sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Trong Tai:" + trongTai);
        System.out.println("Tinh tien qua tram: " + TinhTienQuaTram());
    }

    @Override
    public double TinhTienQuaTram(){
        if (trongTai < 3)
            return 15000;
        else
            return 30000;
    }
}
