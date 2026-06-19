package ngay8_6.exercise;

public class Point {
    private int x, y;

    // Constructor mặc định
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor có tham số
    public Point(int X, int Y) {
        this.x = X;
        this.y = Y;
    }

    public int getX() { return x; }
    public void setX(int X) { this.x = X; }

    public int getY() { return y; }
    public void setY(int Y) { this.y = Y; }

    // Tính khoảng cách từ điểm này đến điểm p khác
    // Công thức: sqrt((x2-x1)^2 + (y2-y1)^2)
    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
