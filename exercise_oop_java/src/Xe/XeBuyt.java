package Xe;
import java.util.Scanner;

public class XeBuyt extends Xe {
    private int soTuyen;
    private double dodaiLotrinh;

    public XeBuyt(){
    }
    public XeBuyt(String bienso, String mauXe, String nhanHieu, int soTuyen, double dodaiLotrinh ){
        super(bienso, mauXe,nhanHieu);
        this.soTuyen = soTuyen;
        this.dodaiLotrinh = dodaiLotrinh;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getDodaiLotrinh() {
        return dodaiLotrinh;
    }

    public void setDodaiLotrinh(double dodaiLotrinh) {
        this.dodaiLotrinh = dodaiLotrinh;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So Tuyen xe: ");
        soTuyen = sc.nextInt();
        sc.nextLine();

        System.out.println("Do dai lo trinh:");
        dodaiLotrinh = sc.nextDouble();
        sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So tuyen       : " + soTuyen);
        System.out.println("Do dai lo trinh: " + dodaiLotrinh+ " km");
        System.out.println("Tien qua tram  : " + TinhTienQuaTram());
    }

    @Override
    public double TinhTienQuaTram() {
        if (dodaiLotrinh > 20)
            return 10000;
        else
            return 5000;
    }
}
