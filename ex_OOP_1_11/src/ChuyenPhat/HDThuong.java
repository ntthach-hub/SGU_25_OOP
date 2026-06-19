package ChuyenPhat;

public class HDThuong extends HDChuyenPhat{
    private int soLanGui;
    public HDThuong(){}
    public HDThuong(String MaVD, String tenNguoiGui, String tenNguoiNhan, String diachiNhan, double sokg, int soLanGui){
        super(MaVD, tenNguoiGui,tenNguoiNhan,diachiNhan,sokg);
        this.soLanGui = soLanGui;
    }
    @Override
    public double tinhtiencuoc(){
        if(soLanGui < 3 )
            return sokg * 8000;
        return sokg * 5000;
    }

    @Override
    public String toString(){
        return "[HDThuong]" + super.toString() + " | so Lan Gui = " + soLanGui + "| Tien = " + tinhtiencuoc();
    }
}
