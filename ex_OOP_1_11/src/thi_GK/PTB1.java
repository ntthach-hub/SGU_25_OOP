package thi_GK;

public class PTB1 {
    protected double b;
    protected double c;

    public PTB1(double b1, double c1) {
        b = b1;
        c = c1;
    }

    public String getSolution() {
        if (b == 0) {
            if (c == 0) {
                return "Phuong trinh vo so nghiem";
            } else {
                return "Phuong trinh vo nghiem";
            }
        } else {
            double x = -c / b;
            return "x = " + x;
        }
    }

    public String toString() {
        return b + "x + " + c + " = 0";
    }
}
