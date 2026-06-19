package ChuyenPhat;

public class Test {
    public static void main(String[] args) {
        DsHD list = new DsHD();

        list.themHD(new HDThuong("VD01","A","B","HCM",2,2));
        list.themHD(new HD24h("VD02","C","D","HN",3));
        list.themHD(new HD2h("VD03","E","F","DN",1,5));

        list.Hienthi();
        System.out.println("Tong tien cuoc: " + list.Tongtiencuoc());
    }
}
