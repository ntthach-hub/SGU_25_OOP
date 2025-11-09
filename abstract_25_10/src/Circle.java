public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("red", true); // gọi tạm constructor của Shape, hoặc giá trị mặc định
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled); // gọi constructor của lớp cha Shape
        this.radius = radius;


    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius *radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*2 * radius;
    }
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }

}

