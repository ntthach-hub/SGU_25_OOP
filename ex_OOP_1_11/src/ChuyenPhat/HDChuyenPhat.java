package ChuyenPhat;

public abstract class HDChuyenPhat {

    protected String MaVD;
    protected String tenNguoiGui;
    protected String tenNguoiNhan;
    protected String diachiNhan;
    protected double sokg;

    public HDChuyenPhat(){}
    public HDChuyenPhat(String MaVD , String tenNguoiGui, String tenNguoiNhan,String diachiNhan, double sokg){
        this.MaVD = MaVD;
        this.tenNguoiGui = tenNguoiGui;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diachiNhan = diachiNhan;
        this.sokg = sokg;
    }

    public String getMaVD(){
        return MaVD;
    }

    public void setMaVD(String maVD) {
        MaVD = maVD;
    }
    public String getTenNguoiGui(){
        return tenNguoiGui;
    }

    public void setTenNguoiGui(String tenNguoiGui) {
        this.tenNguoiGui = tenNguoiGui;
    }
    public String getTenNguoiNhan(){
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }
    public String getDiachiNhan(){
        return diachiNhan;
    }

    public void setDiachiNhan(String diachiNhan) {
        this.diachiNhan = diachiNhan;
    }
    public double getSokg(){
        return sokg;
    }

    public void setSokg(double sokg) {
        this.sokg = sokg;
    }

    public abstract double tinhtiencuoc();

    @Override
    public String toString(){
        return MaVD + "| " + tenNguoiGui + "|" + tenNguoiNhan + "|" + diachiNhan + "|" + sokg + "kg";
    }
}
