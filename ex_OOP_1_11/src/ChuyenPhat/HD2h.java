package ChuyenPhat;

public class HD2h extends HDChuyenPhat{
    private double khoangcach;
    public HD2h(){}
    public HD2h(String MaVD, String tenNguoiGui, String tenNguoiNhan,String diachiaNhan,double sokg, double khoangcach){
        super(MaVD,tenNguoiGui,tenNguoiNhan,diachiaNhan,sokg);
        this.khoangcach = khoangcach;
    }

    @Override
    public double tinhtiencuoc(){
        if(khoangcach < 2)  return 25000;
        return 35000 + (khoangcach - 2) * 5000;
    }
    @Override
    public String toString(){
        return "[HD2h]" + super.toString() + "khoang cach: " + khoangcach + "Tien = " + tinhtiencuoc();
    }


}
