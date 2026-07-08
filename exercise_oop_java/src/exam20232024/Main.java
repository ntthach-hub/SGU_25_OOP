package exam20232024;

public class Main {
    public static void main(String[] args){
        MemberList ds = new MemberList(50);

        ds.them();
        ds.them();

        ds.xuat();
        System.out.println("Tong phi: "+ ds.TongPhi());
    }
}
