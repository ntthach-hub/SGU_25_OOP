package ChuyenPhat;

import java.util.ArrayList;

public class DsHD {
    private ArrayList<HDChuyenPhat> ds = new ArrayList<>();

    public void themHD(HDChuyenPhat hd){
        ds.add(hd);
    }

    public void Hienthi(){
        for(HDChuyenPhat hd : ds){
            System.out.println(hd);
        }
    }

    public double Tongtiencuoc(){
        double sum = 0;
        for(HDChuyenPhat hd: ds){
            sum += hd.tinhtiencuoc();
        }
        return sum;
    }
}
