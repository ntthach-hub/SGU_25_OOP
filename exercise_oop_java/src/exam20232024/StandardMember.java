package exam20232024;

public class StandardMember extends Member{
    public StandardMember(){}
    public StandardMember(String ten, int loai, String diachi){
        super(ten,loai,diachi);
    }
    @Override
    public double tinhPhi(){
        return 100000;
    }
}
