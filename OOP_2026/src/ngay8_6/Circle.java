package ngay8_6;

public class Circle {
    // các thuộc tính có mức độ truy xuất private
    private double radius;
    private String color;

    // Bộ khởi tạo
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Construced a Circle with Circle()"); // Để kiểm tra
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Construced a Circle with Circle(radius)");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with Circle(radius, color)");
    }

    // phương thức công khai getters và setters để lấy thông tin thuộc tính private
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Mô tả thông tin đối tượng theo dạng chuỗi
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    // Tính diện tích hình tròn
    public double getArea() {
        return radius * radius * Math.PI;
    }
}