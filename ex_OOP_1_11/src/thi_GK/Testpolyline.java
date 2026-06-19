package thi_GK;

public class Testpolyline {
    public static void main(String[] args) {

        Polyline pl = new Polyline();

        pl.appendPoint(0, 0);
        pl.appendPoint(2, 0);
        pl.appendPoint(2, 2);
        pl.appendPoint(0, 2);

        System.out.println("PolyLine: " + pl);

        System.out.println("Length = " + pl.getLength());      // 6
        System.out.println("Perimeter = " + pl.getPerimeter()); // 8
        System.out.println("Area = " + pl.getArea());           // 4
    }
}
