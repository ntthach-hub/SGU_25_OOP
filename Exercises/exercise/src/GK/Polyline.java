package GK;

import java.util.ArrayList;

public class Polyline {
    private ArrayList<Point> points = new ArrayList<Point>();

    public Polyline(){}

    public Polyline(ArrayList<Point> points){
        this.points = points;
    }

    public void add(int x, int y){
        points.add(new Point(x,y));
    }
    public void add(Point p){
        points.add(p);
    }

    // CAU 3 - "ve" da giac n canh, in ra dang {(x1,y1)(x2,y2)...}
    public String toString(){
        String s = "{";
        for(int i = 0 ; i < points.size() ; i++){
            s += points.get(i).toString();
        }
        s +="}";
        return s;
    }

    // CAU 1c - chieu dai duong gap khuc (KHONG khep kin)
    public double getlength(){
        if(points.size() < 2) return 0;

        double sum = 0;
        for(int i = 0 ; i < points.size() - 1 ; i++){
            sum += points.get(i).distance(points.get(i + 1));
        }
        return sum;
    }

    // CAU 1c - chu vi (co noi diem cuoi ve diem dau)
    public double getPerimeter(){
        int n = points.size();
        if(n < 2) return 0;

        double sum = 0;
        for(int i = 0 ; i < n -1 ; i++){
            sum += points.get(i).distance(points.get(i + 1));
        }
        sum += points.get(n - 1).distance(points.get(0));
        return  sum;
    }

    // CAU 1c, CAU 5 - dien tich da giac (cong thuc Shoelace)
    public double getArea(){
        int n = points.size();
        if(n < 3 ) return 0;

        double sum = 0;
        for(int i = 0; i < n -1 ; i++){
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            sum += p1.getX() * p2.getY() - p1.getY() * p2.getX();
        }
        Point plast = points.get(n - 1);
        Point pfirst = points.get(0);
        sum += plast.getX() * pfirst.getY() - plast.getY() * pfirst.getX();

        return Math.abs(sum) / 2.0;
    }

    // CAU 4 - kiem tra diem p co nam trong da giac khong (thuat toan Ray Casting)
    // Ke tia ngang tu p sang phai, dem so lan cat canh da giac
    // Le -> trong, Chan -> ngoai
    public boolean isInside(Point p){
        int n = points.size();
        boolean inside = false;
        for(int i = 0, j = n - 1 ; i < n ; j = i++){
            Point pi = points.get(i);
            Point pj = points.get(j);

            boolean canhBacQua = (pi.getY() > p.getY()) != (pj.getY() > p.getY());
            if(canhBacQua){
                double xGiao = (pj.getX() - pi.getX()) * (p.getY() - pi.getY())
                        / (pj.getY() - pi.getY()) + pi.getX();
                if(p.getX() < xGiao) inside = !inside;
            }
        }
        return inside;
    }
    // CAU 6 - tim diem can bo de da giac (n-1) dinh co dien tich lon nhat
    // Thu lan luot bo tung diem, tinh lai dien tich, chon cai lon nhat
    public Point findVertexToRemove(){
        int n = points.size();
        double maxArea = -1;
        int bestIndex = -1;

        for(int i = 0 ; i < n ; i++){
            ArrayList<Point> temp = new ArrayList<Point>(points);
            temp.remove(i);
            Polyline pl = new Polyline(temp);
            double area = pl.getArea();

            if(area > maxArea){
                maxArea = area;
                bestIndex = i;
            }
        }
        return points.get(bestIndex);
    }
}