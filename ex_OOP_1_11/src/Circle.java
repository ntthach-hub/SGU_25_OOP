public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius  = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public double area(){
        return Math.PI * radius *radius;
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String getName(){
        return "Circle";
    }

    @Override
    public String toString(){
        return "Circle[ radius = " + radius + "]";
    }
}
