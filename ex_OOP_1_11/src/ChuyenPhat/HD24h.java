package ChuyenPhat;

public class HD24h extends HDChuyenPhat{
    public HD24h(){}

    public  HD24h(String MaVD, String tenNguoiGui, String tenNguoiNhan, String diachiNhan, double sokg){
        super(MaVD,tenNguoiGui,tenNguoiNhan,diachiNhan,sokg);
    }
    @Override
    public double tinhtiencuoc(){
        return 25000 + sokg * 2000;
    }
    @Override
    public String toString(){
        return "[HD24h]" + super.toString() + "| tien = " + tinhtiencuoc();
    }

}
