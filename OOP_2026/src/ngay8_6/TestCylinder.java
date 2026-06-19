package ngay8_6;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        // Đối tượng đường tròn được tạo theo bộ khởi tạo Circle()
        // Đối tượng hình trụ được tạo theo bộ khởi tạo Cylinder()
        System.out.println("Radius is " + cy1.getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getColor()
                + ", Base area is " + cy1.getArea()
                + ", Volume is " + cy1.getVolume());
        //Radius is 1.0, Height is 1.0, Color is red,
        //Base area is 3.141592653589793, Volume is 3.141592653589793

        Cylinder cy2 = new Cylinder(5.0, 2.0);
        // Đường tròn được tạo theo bộ khởi tạo Circle(radius)
        // Hình trụ được tạo theo bộ khởi tạo Cylinder(height, radius)
        System.out.println("Radius is " + cy2.getRadius()
                + ", Height is " + cy2.getHeight()
                + ", Color is " + cy2.getColor()
                + ", Base area is " + cy2.getArea()
                + ", Volume is " + cy2.getVolume());
        //Radius is 2.0, Height is 5.0, Color is red,
        //Base area is 12.566370614359172, Volume is 62.83185307179586
    }
}