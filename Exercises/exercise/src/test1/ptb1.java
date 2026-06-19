package test1;

public class ptb1 {
    protected double b;
    protected double c;

    public ptb1(double b1, double c1){
        this.b = b1;
        this.c = c1;
    }

    public String giaiphap(){
        if(b == 0){
            if(c==0){
                return "phuong trinh vo so nghiem" ;
            } else {
                return "phuong tring vo nghiem";
            }
        }
        else {
            double x = -c/b;
            return "x =" + x;
        }
    }
}
