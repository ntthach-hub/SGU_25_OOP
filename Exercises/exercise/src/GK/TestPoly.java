package GK;

public class TestPoly {
    public static void main(String[] args) {
        Polyline pl = new Polyline();

        pl.add(2,3);
        pl.add(1,2);
        pl.add(3,2);
        pl.add(4,2);
        // CAU 3
        System.out.println("da giac: " + pl);

        // CAU 1c
        System.out.println("do dai :" + pl.getlength());
        System.out.println("chu vi :" + pl.getPerimeter());

        // CAU 5
        System.out.println("dien tich :" + pl.getArea());

        System.out.println("------------------------");

        // Dung mot da giac khac de test cau 4, 6 cho ro rang hon (ngu giac)
        Polyline poly = new Polyline();
        poly.add(0, 0);
        poly.add(4, 0);
        poly.add(5, 3);
        poly.add(2, 5);
        poly.add(-1, 3);

        System.out.println("ngu giac: " + poly);
        System.out.println("dien tich ngu giac: " + poly.getArea());

        // CAU 4
        Point pTrong = new Point(2, 2);
        Point pNgoai = new Point(6, 6);
        System.out.println("diem " + pTrong + " co nam trong da giac? " + poly.isInside(pTrong));
        System.out.println("diem " + pNgoai + " co nam trong da giac? " + poly.isInside(pNgoai));

        // CAU 6
        Point boDinh = poly.findVertexToRemove();
        System.out.println("nen bo dinh: " + boDinh + " de dien tich (n-1) dinh lon nhat");
    }
}