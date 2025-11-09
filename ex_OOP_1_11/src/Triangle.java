public class Triangle extends Shape{
    public double a, b, c;  // 3 cạnh tam giác

    // Constructor có 3 tham số
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Tính diện tích bằng công thức Heron
    @Override
    public double area() {
        double s = (a + b + c) / 2.0; // nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double perimeter(){
        return a+b+c;
    }

    @Override
    public String getName(){
        return "Triangle";
    }

    @Override
    public String toString(){
        return "Triangle[ a =" + a +" b = " + b + " c = " + c +"]";
    }
}
