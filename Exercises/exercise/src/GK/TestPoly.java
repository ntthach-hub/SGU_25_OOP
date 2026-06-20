package GK;

public class TestPoly {
    public static void main(String[] args) {
        Polyline pl = new Polyline();

        pl.add(2,3);
        pl.add(1,2);
        pl.add(3,2);
        pl.add(4,2);

        System.out.println("do dai :" + pl.getlength());
        System.out.println("chu vi :" + pl.getPerimeter());
        System.out.println("dien tich :" + pl.getArea());
    }
}