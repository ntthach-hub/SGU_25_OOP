package ngay8_6.exercise;

public class Main {
    public static void main(String[] args){
        System.out.println("=== POINT ===");
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("khoang cach p1->p2: " + p1.distance(p2));

        System.out.println("\n=== LINE ===");
        Line line = new Line(new Point(0, 2), new Point(4, 0));
        System.out.println(line);
        // xIntercept private => không gọi được từ ngoài — đúng thiết kế

        System.out.println("\n=== CIRCLE ===");
        Circle c = new Circle(new Point(0, 0), 5);
        System.out.println(c);

        System.out.println("\n=== CYLINDER (ke thua Circle) ===");
        Cylinder cy = new Cylinder(new Point(0, 0), 5, 10);
        System.out.println(cy);

        // Cylinder là Circle => dùng được phương thức kế thừa
        System.out.println("getR() ke thua tu Circle: " + cy.getR());
        System.out.println("getCenter() ke thua tu Circle: " + cy.getCenter());

        // Polymorphism: dùng biến kiểu Circle để giữ Cylinder
        System.out.println("\n=== POLYMORPHISM ===");
        Circle shape = new Cylinder(new Point(1, 1), 3, 7);
        System.out.println("getArea() goi -> thuc ra chay cua Cylinder: "
                + String.format("%.2f", shape.getArea()));
    }
}
