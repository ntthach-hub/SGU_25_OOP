package ngay8_6.exercise;

// Inheritance: CYLINDER kế thừa CIRCLE
// CYLINDER tự động có: center, r, getCenter, setCenter, getR, setR, getArea
// CYLINDER chỉ cần thêm: height và các phương thức liên quan
public class Cylinder extends Circle {
    private int height;

    public Cylinder() {
        super(); // gọi constructor mặc định của Circle
        this.height = 0;
    }

    public Cylinder(Point p, int R, int height) {
        super(p, R); // gọi constructor Circle(Point, int) — truyền center và r lên cha
        this.height = height;
    }

    public int getHeight() { return height; }
    public void setHeight(int h) { this.height = h; }

    // Override getArea(): diện tích toàn phần = 2*π*r*h + 2*π*r^2
    @Override
    public double getArea() {
        return 2 * Math.PI * getR() * height
                + 2 * Math.PI * getR() * getR();
    }

    // Thể tích: π * r^2 * h
    public double getVolume() {
        return Math.PI * getR() * getR() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[center=" + getCenter()
                + ", r=" + getR()
                + ", height=" + height
                + ", area=" + String.format("%.2f", getArea())
                + ", volume=" + String.format("%.2f", getVolume()) + "]";
    }
}