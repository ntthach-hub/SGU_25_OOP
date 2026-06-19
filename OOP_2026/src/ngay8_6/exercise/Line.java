package ngay8_6.exercise;

public class Line {
    // Aggregation: LINE "có" 2 điểm POINT
    // Nhưng POINT tồn tại độc lập với LINE
    private Point A, B;

    // Constructor mặc định — 2 điểm gốc toạ độ
    public Line() {
        this.A = new Point(0, 0);
        this.B = new Point(0, 0);
    }

    // Constructor với 2 điểm cho trước
    public Line(Point p1, Point p2) {
        this.A = p1;
        this.B = p2;
    }

    public Point getA() { return A; }
    public void setA(Point p) { this.A = p; }

    public Point getB() { return B; }
    public void setB(Point p) { this.B = p; }  // sơ đồ ghi setY nhưng logic phải là setB

    // Tính độ dài đoạn thẳng A-B
    public double distance() {
        return A.distance(B);
    }

    // Private: chỉ dùng nội bộ trong class
    // Giao điểm với trục X: y = 0 => x = xA - yA*(xB-xA)/(yB-yA)
    private double xIntercept() {
        int dy = B.getY() - A.getY();
        if (dy == 0) return Double.NaN; // đường nằm ngang, không cắt trục X
        return A.getX() - (double) A.getY() * (B.getX() - A.getX()) / dy;
    }

    // Giao điểm với trục Y: x = 0 => y = yA - xA*(yB-yA)/(xB-xA)
    private double yIntercept() {
        int dx = B.getX() - A.getX();
        if (dx == 0) return Double.NaN; // đường thẳng đứng, không cắt trục Y
        return A.getY() - (double) A.getX() * (B.getY() - A.getY()) / dx;
    }

    @Override
    public String toString() {
        return "Line[A=" + A + ", B=" + B
                + ", length=" + String.format("%.2f", distance())
                + ", xIntercept=" + String.format("%.2f", xIntercept())
                + ", yIntercept=" + String.format("%.2f", yIntercept()) + "]";
    }
}
