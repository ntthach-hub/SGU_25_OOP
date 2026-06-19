package ex;
// parabol: y = a*x^2 + b*x +c
public class Quadratic {
    public double a, b,c;

    public Quadratic(){
        a = 1; b = 0; c = 0;
    }
    public Quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getY(double x){
        return a*x*x + b*x + c;
    }
    @Override
    public String toString(){
        return "y= " + a+"x^2" + b+"x" + c;
    }
}
