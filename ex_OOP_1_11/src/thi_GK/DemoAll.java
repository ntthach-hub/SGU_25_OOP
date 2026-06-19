package thi_GK;

import java.util.Arrays;
import java.util.List;


public class DemoAll {
    public static void main(String[] args) {

        // TEST CÂU 3: tạo đa giác từ điểm lộn xộn
        List<Point> cloud = Arrays.asList(
                new Point(0,0), new Point(4,0),
                new Point(3,5), new Point(5,3),
                new Point(1,3)
        );
        Polygon poly = Polygon.xaydagiac(cloud);
        System.out.println("Polygon   : " + poly);
        System.out.println("Area      : " + poly.area());
        System.out.println("Perimeter : " + poly.perimeter());

        //  TEST CÂU 4: contains
        Point P = new Point(2,2);
        System.out.println("P inside? : " + poly.contains(P));

        //TEST CÂU 6: bỏ 1 đỉnh
        int idx = poly.bestVertexToRemove();
        System.out.println("Remove idx: " + idx + "  ->  point " + poly.get(idx));

    }
}
