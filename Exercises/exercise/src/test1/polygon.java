package test1;

import java.util.ArrayList;
import java.util.List;

public class polygon {
    private ArrayList<point> pt = new ArrayList<>();

    public static polygon xaydagiac(List<point> list){
        // tinh tam
        double sumx = 0, sumy = 0;
        for(point p : list){
            sumx += p.getX();
            sumy += p.getY();
        }
        final double cx = sumx / list.size();
        final double cy = sumy / list.size();

        list.sort((point p1 , point p2 ) ->{
            double a1 = Math.atan2(p1.getY() - cy, p1.getX() - cx);
            double a2 = Math.atan2(p2.getY() - cy , p2.getX() - cx);
            return Double.compare(a1,a2);
        });
        return new polygon(new ArrayList<>(list));
    }
    public polygon (ArrayList<point> point){
        this.pt = point;
    }
    public polygon(){
    }
    public void add(point p){
        pt.add(p);
    }
    public int size(){
        return pt.size();
    }
    public point get(int i ){
        return pt.get(i);
    }
    // cau 4
    public boolean contains(point p){
        boolean in = false;
        int n = pt.size();

        for(int i = 0, j = n -1; i < n; j ++ ){
            point pi = pt.get(i), pj = pt.get(j);

            boolean cross = ((pi.getY() > p.getY()) != (pj.getY() > p.getY()) &&
                    p.getX() < (pj.getX() - pi.getX()) * (pj.getY() - pi.getY())/(pj.getY() - pi.getY()));
            if(cross) in = !in;
        }
        return in;
    }

}
