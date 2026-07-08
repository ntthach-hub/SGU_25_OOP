package exam20202021;

public class FullName {
    private String ho;
    private String tendem;
    private String ten;

    public FullName(String ho, String tendem, String ten){
        this.ho = ho;
        this.tendem = tendem;
        this.ten  = ten;
    }
    @Override
    public String toString(){
        return ho + "," + tendem + ", "+ ten;
    }
}


