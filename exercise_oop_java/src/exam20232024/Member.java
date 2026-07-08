package exam20232024;

import java.util.Scanner;

public abstract class Member {
    private String ten;
    private int loai;
    private String diachi;

    public Member(){}
    public Member(String ten, int loai, String diachi){
        this.ten = ten;
        this.loai = loai;
        this.diachi = diachi;
    }
    public String getTen(){
        return ten;
    }

    public int getLoai() {
        return loai;
    }

    public String getDiachi() {
        return diachi;
    }
    public void setTen(String ten){
        this.ten = ten;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten: ");
        ten = sc.nextLine();

        System.out.print("Loai: ");
        loai = sc.nextInt();
        sc.nextLine();

        System.out.print("Dia chi: ");
        diachi = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ten: "+ ten);
        System.out.println("Loai: "+ loai);
        System.out.println("Dia chi: "+ diachi);
        System.out.println("Phi: "+ tinhPhi());
    }
    public abstract double tinhPhi();
}
