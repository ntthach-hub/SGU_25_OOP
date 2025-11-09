package quanliquanan;

public class Ban {
    private int maban; // ma ban
    private boolean Banlon; //bàn lớn
    private boolean coKhach; // ban co khach

    public Ban(int maban, boolean Banlon ){
        this.maban = maban;
        this.Banlon = Banlon;
        this.coKhach = false;
    }

    public int getMaban(){
        return maban;
    }

    public boolean isCoKhach(){
        return coKhach;
    }
    public void datban(){
        coKhach = true;
    }
    public  void traban(){
        coKhach = false;
    }

    public void Hienthithongtin(){
        System.out.println("Ban " + maban + " (" + (Banlon ? "lon" : "nho ") + ")"+ (coKhach ? "Dang co khach " : "Dang trong")) ;
    }
}
