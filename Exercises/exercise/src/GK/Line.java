package GK;

public class Line {
    double  m, k;
    public Line(double m, double k){

        this.m = m;
        this.k = k;
    }
    public String toString(){
        return "y = " + m + "x + " + k;
    }
}
