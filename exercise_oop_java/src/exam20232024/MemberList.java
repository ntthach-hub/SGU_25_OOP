package exam20232024;

import java.util.Scanner;

public class MemberList {
    private Member[] ds;
    private int n;

    public MemberList(int max){
        ds = new Member[max];
        n = 0;
    }
    public void them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Standard Member");
        System.out.println("2. Senior Member");
        System.out.println("Chon: ");
        int chon = sc.nextInt();
        sc.nextLine();

        if(chon == 1)
            ds[n] = new StandardMember();
        else
            ds[n] = new SeniorMember();
        ds[n].nhap();
        n++;
    }
    public double TongPhi(){
        double tong = 0;
        for(int i = 0; i< n; i++){
            tong+=ds[i].tinhPhi();
        }
        return tong;
    }
    public void xuat(){
        for(int i = 0; i<n; i++) {
            ds[i].xuat();
            System.out.println("----------");
        }
    }
}
