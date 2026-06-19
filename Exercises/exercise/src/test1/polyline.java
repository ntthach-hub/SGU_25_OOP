package test1;

import java.util.ArrayList;

public class polyline {

    private ArrayList<point> pot = new ArrayList<point>();

    public polyline(){
    }
    public polyline ( ArrayList<point> pot){
        this.pot = pot;
    }

    public void themdiem(int x, int y){
        pot.add(new point(x,y));
    }
    public void themdiem(point p){
        pot.add(p);
    }
    public String toString(){
        String s = "{";
        for(int i = 0 ; i < pot.size(); i ++){
            s += pot.get(i).toString();
        }
        s += "}";
        return s;
    }

    public double dodai(){

        if(pot.size() < 2) return 0;

        double sum = 0;
        for(int i = 0; i < pot.size() -1 ; i++){
            sum += pot.get(i).khoangcach(pot.get(i+1));
        }
        return sum;
    }

    public  double chuvi(){
        int n = pot.size();
        if( n < 2 ) return 0;

        double tcv = 0;
        for(int i = 0 ; i < n - 1; i++){
            tcv += pot.get(i).khoangcach(pot.get(i + 1));
        }
        tcv += pot.get(n-1).khoangcach(pot.get(0));
        return  tcv;
    }
    public double dientich(){
        int n = pot.size();
        if(n < 3 ) return 0;

        double tdt = 0;
        for(int i = 0; i < n -1 ; i++){
            point p1 = pot.get(i);
            point p2 = pot.get(i+1);
            tdt = p1.getX() * p2.getY() - p1.getY() * p2.getX();
        }
        return Math.abs(tdt/ 2.0) ;
    }
    // cau 7
    public static double[] giaodiem(line l, quadratic f){
        double A = f.a;
        double B = f.b - l.m;
        double C = f.c - l.k;

        double delta = B*B - 4 * A* C;
        if(delta < 0) return new double[0];
        if (delta == 0) return new double[]{-B/2*A};
        double s = Math.sqrt(delta);
        double x1 = (-B + s)/ (2*A);
        double x2 = (-B - s)/ (2*A);
        return new double[]{x1,x2};
    }
}
