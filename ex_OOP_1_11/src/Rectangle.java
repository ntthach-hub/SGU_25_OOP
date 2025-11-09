public class Rectangle extends Shape {
    private double width;
    private double lenght;

    public Rectangle ( double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getLenght(){
        return this.lenght;
    }

    @Override
    public double area(){
        return width * lenght;
    }
    @Override
    public double perimeter(){
        return 2*(width + lenght);
    }
    @Override
    public String getName(){
        return "Rectangle";
    }
    @Override
    public String toString(){
        return "Rectangle[ width=" + width + ", lenght="+ lenght + "]";
    }
}
