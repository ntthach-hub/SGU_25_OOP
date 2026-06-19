package thi_GK;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private ArrayList<Point> pts = new ArrayList<>();

    // Câu 3: xây đa giác từ n điểm lộn xộn
    public static Polygon xaydagiac(List<Point> list) {
// 1. tính tâm
        double sumX = 0, sumY = 0;
        for (Point p : list) {
            sumX += p.getX();
            sumY += p.getY();
        }
        final double cx = sumX / list.size();
        final double cy = sumY / list.size();

// 2. sắp xếp theo góc cực quanh tâm
        list.sort((Point p1, Point p2) -> {
            double a1 = Math.atan2(p1.getY() - cy, p1.getX() - cx);
            double a2 = Math.atan2(p2.getY() - cy, p2.getX() - cx);
            return Double.compare(a1, a2);
        });

// 3. tạo Polygon
        return new Polygon(new ArrayList<>(list));
    }

    // Constructor nhận list đã theo thứ tự chu vi
    public Polygon(ArrayList<Point> points) { this.pts = points; }
    public Polygon() {}

    public void add(Point p) { pts.add(p); }               // thêm điểm đã đúng vị trí
    public int size() { return pts.size(); }
    public Point get(int i) { return pts.get(i); }

    // CÂU 4: kiểm tra điểm bên trong đa giác
    public boolean contains(Point p) {
        boolean in = false;
        int n = pts.size();
        for (int i = 0, j = n - 1; i < n; j = i++) {
            Point pi = pts.get(i), pj = pts.get(j);
            // hai đỉnh khác phía so với p.y
            boolean cross = (pi.getY() > p.getY()) != (pj.getY() > p.getY()) &&
                    p.getX() < (pj.getX() - pi.getX()) * (p.getY() - pi.getY())
                            / (pj.getY() - pi.getY()) + pi.getX();
            if (cross) in = !in;
        }
        return in;
    }

    // CÂU 5: diện tích (shoelace)
    public double area() {
        int n = pts.size();
        if (n < 3) return 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            Point a = pts.get(i);
            Point b = pts.get((i + 1) % n);
            sum += a.getX()*b.getY() - a.getY()*b.getX();
        }
        return Math.abs(sum) / 2.0;
    }

    //chu vi
    public double perimeter() {
        int n = pts.size();
        if (n < 2) return 0;
        double p = 0;
        for (int i = 0; i < n; i++)
            p += pts.get(i).distance(pts.get((i + 1) % n));
        return p;
    }

    // CÂU 6: tìm đỉnh bỏ đi để diện tích còn lại max
    public int bestVertexToRemove() {
        int n = pts.size();
        if (n <= 3) return -1;
        double total = area();
        double best = -1;
        int bestIdx = -1;

        for (int i = 0; i < n; i++) {
            Point prev = pts.get((i + n - 1) % n);
            Point cur  = pts.get(i);
            Point next = pts.get((i + 1) % n);

            // diện tích tam giác (prev,cur,next)
            double tri = Math.abs(
                    prev.getX()*cur.getY() + cur.getX()*next.getY() + next.getX()*prev.getY()
                            - prev.getY()*cur.getX() - cur.getY()*next.getX() - next.getY()*prev.getX()
            ) / 2.0;

            double remain = total - tri;
            if (remain > best) { best = remain; bestIdx = i; }
        }
        return bestIdx;   // trả chỉ số đỉnh cần cắt
    }

    public String toString() { return pts.toString(); }
}
