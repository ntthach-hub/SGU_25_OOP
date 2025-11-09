package quanliquanan;

import java.util.ArrayList;
import java.util.Scanner;

public class quanlitiempho  {

    private ArrayList<Ban> dsBan;
    private ArrayList<HoaDon> dsHoaDon;
    private Scanner sc = new Scanner(System.in);

    public quanlitiempho(){
        dsBan = new ArrayList<>();
        dsHoaDon = new ArrayList<>();
        // khoi tao 30 ban nho va 20 ban lon
        for(int i = 1; i<= 30; i++) {
            dsBan.add(new Ban(i, false));
        }
        for ( int i = 31 ; i<= 50; i++){
            dsBan.add(new Ban(i, true));
        }
    }
    public void HienthitrangthaiBan(){
        for(Ban b : dsBan) b.Hienthithongtin();
    }

}
