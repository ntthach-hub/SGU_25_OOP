package thi_GK;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private ArrayList<Point> points = new ArrayList<Point>();

    public Polyline() {
    }

    public Polyline(ArrayList<Point> points) {
        this.points = points;
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public void appendPoint(Point p) {
        points.add(p);
    }

    public String toString() {
        String s = "{";
        for (int i = 0; i < points.size(); i++) {
            s += points.get(i).toString();
        }
        s += "}";
        return s;
    }

    public double getLength() {
        if (points.size() < 2) return 0;

        double sum = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            sum += points.get(i).distance(points.get(i + 1));
        }
        return sum;
    }
    // --- Câu 1c ---
    public double getPerimeter() {
        int n = points.size();
        if (n < 2) return 0;

        double p = 0;
        for (int i = 0; i < n - 1; i++) {
            p += points.get(i).distance(points.get(i + 1));
        }
        p += points.get(n - 1).distance(points.get(0));
        return p;
    }

    public double getArea() {
        int n = points.size();
        if (n < 3) return 0;

        double sum = 0;
        for (int i = 0; i < n - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            sum += p1.getX() * p2.getY() - p1.getY() * p2.getX();
        }
        Point plast = points.get(n - 1);
        Point pfirst = points.get(0);
        sum += plast.getX() * pfirst.getY() - plast.getY() * pfirst.getX();

        return Math.abs(sum) / 2.0;
    }
}
