public class Main {
    public static void main(String[] args) {

        // Tạo đối tượng Circle
        Circle c1 = new Circle(5.0, "red", true);
        System.out.println("=== Circle ===");
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println();

        // Tạo đối tượng Rectangle
        Rectangle r1 = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println("=== Rectangle ===");
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println();

        // Tạo đối tượng Square
        Square s1 = new Square(4.0, "green", true);
        System.out.println("=== Square ===");
        System.out.println(s1.toString());
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println();

        // Kiểm tra tính kế thừa (đa hình)
        Shape shape1 = new Circle(2.5, "purple", true);
        Shape shape2 = new Rectangle(3.0, 5.0, "orange", false);
        Shape shape3 = new Square(3.0, "yellow", true);

        System.out.println("=== Polymorphism test ===");
        System.out.println(shape1); // Gọi toString() của Circle
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());

        System.out.println(shape2); // Gọi toString() của Rectangle
        System.out.println("Area: " + shape2.getArea());
        System.out.println("Perimeter: " + shape2.getPerimeter());

        System.out.println(shape3); // Gọi toString() của Square
        System.out.println("Area: " + shape3.getArea());
        System.out.println("Perimeter: " + shape3.getPerimeter());
    }
}
