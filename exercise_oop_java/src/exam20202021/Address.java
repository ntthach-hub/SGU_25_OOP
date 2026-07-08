package exam20202021;

public class Address {
    private String sonha;
    private String duong;
    private String quan;
    private String thanhpho;

    public Address(String sonha, String duong, String quan, String thanhpho){
        this.sonha = sonha;
        this.duong = duong;
        this.quan = quan;
        this.thanhpho = thanhpho;
    }
    @Override
    public String toString(){
        return sonha +", "+ duong + ", "+ quan+ ", "+ thanhpho;
    }
}
