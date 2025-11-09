import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();

        Shape[] shapes = new Shape[6];

        for (int i = 0; i < shapes.length; i++) {
            int type = rd.nextInt(4); // 0-Circle, 1-Rectangle, 2-Square, 3-Triangle
            switch (type) {
                case 0:
                    shapes[i] = new Circle(1 + rd.nextDouble() * 5);
                    break;
                case 1:
                    shapes[i] = new Rectangle(1 + rd.nextDouble() * 5, 1 + rd.nextDouble() * 5);
                    break;
                case 2:
                    shapes[i] = new Square(1 + rd.nextDouble() * 5);
                    break;
                case 3:
                    double a = 3 + rd.nextDouble() * 3;
                    double b = 3 + rd.nextDouble() * 3;
                    double c = 3 + rd.nextDouble() * 3;
                    if (a + b > c && b + c > a && a + c > b)
                        shapes[i] = new Triangle(a, b, c);
                    else
                        shapes[i] = new Triangle(3, 4, 5);
                    break;
            }
        }

        // In danh sách các hình 
        System.out.println("Danh sach hinh ");
        for (Shape s : shapes)
            System.out.printf("%-45s | Area = %.2f%n", s.toString(), s.area());

        // Tổng diện tích
        double total = 0;
        for (Shape s : shapes)
            total += s.area();
        System.out.printf("%n Total Area : %.2f%n", total);

        // Hình lớn nhất
        Shape max = shapes[0];
        for (Shape s : shapes)
            if (s.area() > max.area())
                max = s;
        System.out.printf("Hinh lon nhat: %s | Area = %.2f%n", max.toString(), max.area());

        // Xóa hình nhỏ nhất
        int minIndex = 0;
        for (int i = 1; i < shapes.length; i++)
            if (shapes[i].area() < shapes[minIndex].area())
                minIndex = i;

        Shape minShape = shapes[minIndex];
        Shape[] newShapes = new Shape[shapes.length - 1];
        for (int i = 0, j = 0; i < shapes.length; i++)
            if (i != minIndex)
                newShapes[j++] = shapes[i];

        System.out.printf("%n Xoa hinh nho nhat: %s | Area = %.2f%n",
                minShape.toString(), minShape.area());

        System.out.println("Sau khi xoa ");
        for (Shape s : newShapes)
            System.out.printf("%-45s | Area = %.2f%n", s.toString(), s.area());
    }
}