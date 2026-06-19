package test1;

public class ptb2 extends ptb1{
    private double a;

    public ptb2(double b1, double c1, double a1){
        super(b1,c1);
        this.a = a1;
    }

    @Override
    public String giaiphap(){
        if(a == 0) return super.giaiphap();

        double dt = b*b - 4*a*c;
        if(dt < 0) {
            return "phuong trinh vo nghiem";
        } else if (dt == 0) {
            double x = -b / 2*a;
            return "phuong trinh co nghiem kep " + x;
        } else {
            double x1 = (-b + Math.sqrt(dt)/(2*a));
            double x2 = (-b - Math.sqrt(dt)/(2*a));
            return "phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2;
        }
    }
    //cau 7

    public static double[] giaodiem(line l, quadratic f){
        double A = f.a;
        double B = f.b - l.m;
        double C = f.c - l.k;

        double delta = B*B - 4 * A * C;
        if (delta < 0) return new double[0];
        if (delta == 0) return new double[]{-B/2*A};

        double s = Math.sqrt(delta);
        double x1 = (-B + s) / (2*A);
        double x2 = ( - B - s) / (2 *A);
        return new double[] {x1,x2};
    }

    // cau 8
    public static line tiepxucss(line l1, quadratic f){
        double m = l1.m;
        double k = ((f.b - m) * (f.b - m) - 4 *f.a * f.a / (-4 *f.a));
        return  new line(m,k);
    }
}
