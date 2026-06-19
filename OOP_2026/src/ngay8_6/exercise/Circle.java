package ngay8_6.exercise;

public class Circle {
    private Point center;
    private int r;

    public Circle(){
        this.center = new Point(0,0);
        this.r = 0;
    }
    public Circle(Point p, int R){
        this.center = p;
        this.r = R;
    }
    public Point getCenter() { return center; }
    public void setCenter(Point p) { this.center = p; }

    public int getR() { return r; }
    public void setR(int R) { this.r = R; }

    // Diện tích hình tròn: π * r^2
    public double getArea() {
        return Math.PI * r * r;
    }
    @Override
    public String toString() {
        return "Circle[center=" + center
                + ", r= " + r
                + ", area= " + String.format("%.2f", getArea()) + "]";
    }
}
