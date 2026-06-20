package GK;

public class PTB2 extends PTB1{
    private double a ;

    public PTB2(double b1, double c1, double a1){
        super(b1, c1);
        this.a = a1;
    }

    @Override
    public String Solution(){
        if(a == 0){
            return super.Solution();
        }
        double delta = b*b - 4*a*c;
        if(delta < 0){
            return "phuong trinh vo nghiem";
        } else if (delta == 0){
            // SUA loi 1: -b / 2 * a tinh sai do thu tu phep toan
            // -b/2*a = (-b/2)*a, can phai la -b/(2*a)
            double x = -b / (2 * a) ;
            return "phuong trinh co nghiem kep " + x;
        } else {
            double x1 = (- b + Math.sqrt(delta)) / (2 *a );
            double x2 = (- b - Math.sqrt(delta)) / (2 *a );
            return "phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2;
        }
    }
    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }
    //cau 7
    public static  double[] giaodiem(Line l, Quadratic f){
        double A = f.a;
        double B = f.b - l.m;
        double C = f.c - l.k;

        double delta = B*B - 4 * A * C;

        if(delta < 0) return  new double[0];
        // SUA loi 2: cung loi thu tu phep toan nhu tren
        if (delta == 0) return  new double[]{-B/(2*A)};

        double s = Math.sqrt(delta);
        double x1 = (-B + s)/(2* A);
        // SUA loi 3: x2 dang bi gan nham la (-B + s), phai la (-B - s)
        double x2 = (-B - s)/(2*A);
        return new double[]{x1, x2};
    }
    //cau 8
    public static Line tiepxucsongsong(Line l1, Quadratic f){
        double m = l1.m;
        // SUA loi 4: cong thuc tinh k sai hoan toan
        // Tiep xuc <=> delta = 0 cua phuong trinh giao diem
        // (f.b - m)^2 - 4*f.a*(f.c - k) = 0
        // => k = f.c - (f.b - m)^2 / (4*f.a)
        double k = f.c - (f.b - m) * (f.b - m) / (4 * f.a);
        return new Line(m,k);
    }
}
