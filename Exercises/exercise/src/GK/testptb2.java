package GK;


import java.util.Arrays;
import java.util.Random;

import static GK.PTB2.giaodiem;
import static GK.PTB2.tiepxucsongsong;

public class testptb2 {
    public static void main(String[] args){
        Random rd = new Random();
        int n = 3;
        PTB2[] arr = new PTB2[n];

        for(int i = 0 ; i< n; i++){
            double a, b, c;

            do{
                a = rd.nextInt(11)- 5;
            } while (a==0);

            b = rd.nextInt(11 ) - 5;
            c = rd.nextInt(11) - 5;

            arr[i] = new PTB2(a,b,c);
        }
        // in ra phuong trinh va nghiem
        for (int i = 0; i < n; i++) {
            System.out.println("Phuong trinh " + (i + 1) + ": " + arr[i].toString());
            System.out.println("Nghiem: " + arr[i].Solution());
            System.out.println("------------------------");
        }
        /*  TEST CÂU 7: giao l1 và f  */
        Line l1 = new Line(1, 0);                   // y = x
        Quadratic f = new Quadratic(1, -4, 3);      // y = x^2 - 4x + 3
        double[] xs = giaodiem(l1, f);
        System.out.println("giao diem x: " + Arrays.toString(xs));

        /* TEST CÂU 8: tiếp tuyến song song */
        Line l2 = tiepxucsongsong(l1, f);
        System.out.println("tiep xuc song song : " + l2);
    }

}
