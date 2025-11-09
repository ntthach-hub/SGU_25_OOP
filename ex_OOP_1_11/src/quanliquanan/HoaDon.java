package quanliquanan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class HoaDon {
    private String maHD;
    private Ban ban;
    private ArrayList<MonAn> dsMon;
    private LocalDateTime thoi_gian;

    public HoaDon(String maHD, Ban ban){
        this.maHD = maHD;
        this.ban = ban;
        this.dsMon = new ArrayList<>();
        this.thoi_gian = LocalDateTime.now();
        ban.datban(); // khi có hóa đơn tức bàn đang có khách
    }

    public void themMon(MonAn mon){
        dsMon.add(mon);
    }
    public double tinhtongtien(){
        double tong = 0;
        for(MonAn m : dsMon )
            tong += m.tinhTien();
        return tong;
    }

    public void inHoaDon(){
        System.out.println("===== HÓA ĐƠN " + maHD + " =====");
        System.out.println("Bàn: " + ban.getMaban());
        System.out.println("Thời gian: " + thoi_gian.format(DateTimeFormatter.ofPattern("dd/MM//yy HH:mm")));
        System.out.println("Các món đã gọi:");
        for (MonAn m : dsMon) {
            System.out.printf("- %-20s : %.0f VNĐ\n", m.getTen(), m.tinhTien());
        }
        System.out.println("------------------------------------");
        System.out.printf("TỔNG CỘNG: %.0f VNĐ\n", tinhtongtien());
        System.out.println("====================================\n");
        ban.traban(); // sau khi tính tiền thì bàn trống lại
    }

    public LocalDateTime getThoi_gian() {
        return thoi_gian;
    }
}
