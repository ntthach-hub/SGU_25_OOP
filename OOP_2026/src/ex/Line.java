package ex;

public class Line {
    public double m, k;

    public Line() {
        m = 0;
        k = 0;
    }

    public Line(double m, double k) {
        this.m = m;
        this.k = k;
    }

    public double getY(double x) {
        return m * x + k;
    }

    @Override
    public String toString() {
        return "y = " + m + "x + " + k;
    }
}
