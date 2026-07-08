package exam20232024;

public class SeniorMember extends Member{
    public SeniorMember(){
    }
    public SeniorMember(String ten, int loai , String diachi){
        super(ten, loai, diachi);
    }
    @Override
    public double tinhPhi(){
        if(getLoai() <= 2)
            return 200000;
        else
            return 400000;
    }
}
