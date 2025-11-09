package quanliquanan;

public abstract class MonAn {
    protected String ten;
    protected double donGia;

    public MonAn(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public abstract double tinhTien();
}