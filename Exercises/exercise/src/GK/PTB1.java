package GK;

public class PTB1 {
    protected double b;
    protected double c;

    public PTB1(double b1, double c1){
        this.b = b1;
        this.c = c1;
    }

    public String Solution(){
        if( b == 0){
            if( c== 0){
                return "phuong trinh vo so nghiem";
            }
            else {
                return "phuong trinh vo nghiem";
            }
        } else {
            double x = -c/b;
            return "x = "+ x;
        }
    }
}
