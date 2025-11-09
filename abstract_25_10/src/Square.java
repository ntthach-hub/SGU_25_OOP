public class Square extends Rectangle{
    private double side;

    public Square(double side){
        super(side,side); // width = side, length = side
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
        // cập nhật lại width và length của Rectangle cho đồng bộ
        super.setWidth(side);
        super.setLenght(side);
    }
    public double getSide(){
        return this.side;
    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter(){
        return 4* side;
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + ", side=" + side + "]";
    }
}
