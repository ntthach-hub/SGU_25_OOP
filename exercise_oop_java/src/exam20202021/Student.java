package exam20202021;

public class Student {
    private String mssv;
    private FullName fullname;
    private Address address;

    public Student(String mssv, FullName fullname, Address address){
        this.mssv = mssv;
        this.fullname = fullname;
        this.address = address;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public String getMssv(){
        return mssv;
    }
    public FullName getFullname(){
        return fullname;
    }
    public Address getAddress(){
        return address;
    }
    public void printStudent() {
        System.out.println("Ma SV: " + mssv);
        System.out.println("Ho ten: " + fullname);
        System.out.println("Dia chi: " + address);
    }
}
