package GK;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private ArrayList<Point> pts = new ArrayList<>();

    public static Polygon xaydagiac(List<Point> list){
        double sumX = 0, sumY=0;
        for(Point p: list){
            sumX += p.getX();
            sumY += p.getY();
        }
        final double cx = sumX / list.size();
        final double cy = sumY / list.size();

        list.sort((Point p1, Point p2 ) -> {
            double a1 = Math.atan2(p1.getY() - cy, p1.getX() - cx);
            double a2 = Math.atan2(p2.getY() - cy , p2.getX() - cx);
            return Double.compare(a1, a2);
        });
        return new Polygon(new ArrayList<>(list));
    }
    public Polygon(ArrayList<Point> points){
        this.pts = points;
    }
    public Polygon(){
    }
    public void add(Point p){
        pts.add(p);
    }
    public int size(){
        return pts.size();
    }
    public Polygon get(int i){
        return  get(i);
    }

    // cau 4
    public boolean contains(Point p){
        boolean in = false;
        int n = pts.size();

        for(int i = 0 ,j = n - 1; i < n; j ++){
            Point pi = pts.get(i), pj = pts.get(j);

            boolean cross = ((pi.getY() > p.getY()) != (pj.getY() > p.getY()) &&
                    p.getX() < (pj.getX() - pi.getX()) * (pj.getY() - pi.getY())/(pj.getY() - pi.getY()));
            if (cross) in = !in;
        }
        return in;
    }
    // cau 5
    public double area(){
        int n  = pts.size();
        if(n < 3) return 0;

        double s = 0;
        for(int i = 0; i< n -1 ; i++){
            Point a = pts.get(i);
            Point b = pts.get((i+1) %n);
            s += a.getX() * b.getY() - a.getY()*b.getX();
        }
        return (Math.abs(s)/2.0);
    }
    // cau 6
    public int xoadiem(){
        int n = pts.size();
        if(n < 3) return -1;

        double total = area();
        double best = -1;
        int bestidx = -1;

        for(int i = 0 ; i< n; i++){
            Point prev = pts.get((i + n -1) % n);
            Point cur = pts.get(i);
            Point next = pts.get((i +1 ) % n);

            double tri = Math.abs(prev.getX() * cur.getY()+cur.getX()* next.getY() + next.getX()* prev.getY()
            - prev.getX()* cur.getY() - cur.getX()* next.getY() - next.getX()* prev.getY())/2.0;

            double remain = total - tri;
            if(remain > best){
                best = remain;bestidx = i;
            }
        }
        return bestidx;
    }
    public String toString(){
        return pts.toString();
    }
}
