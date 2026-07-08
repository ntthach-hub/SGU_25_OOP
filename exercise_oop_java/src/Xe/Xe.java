package Xe;

import java.util.Scanner;

public abstract class Xe {
    private String bienso;
    private String mauXe;
    private String nhanHieu;

    public Xe(){}
    public Xe(String bienso, String mauXe, String nhanHieu){
        this.bienso = bienso;
        this.mauXe = mauXe;
        this.nhanHieu = nhanHieu;
    }
    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bien so: ");
        bienso = sc.nextLine();
        System.out.println("Mau xe: ");
        mauXe = sc.nextLine();
        System.out.println("Nhan Hieu: ");
        nhanHieu = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Bien so  : " + bienso);
        System.out.println("Mau xe   : " + mauXe);
        System.out.println("Nhan hieu: " + nhanHieu);
    }
    public abstract double TinhTienQuaTram();
}
