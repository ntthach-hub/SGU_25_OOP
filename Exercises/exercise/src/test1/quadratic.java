package test1;

public class quadratic {
    double a,b,c;
    public quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString() { return a + "x^2 + " + b + "x + " + c; }
}
