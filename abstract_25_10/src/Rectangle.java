public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght){
        super("blue", true);
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getLenght(){
        return this.lenght;
    }
    @Override
    public double getArea(){
        return width*lenght;
    }
    @Override
    public double getPerimeter(){
        return 2* (width+lenght);
    }
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ", width=" + width + ", lenght="+ lenght + "]";
    }
}
