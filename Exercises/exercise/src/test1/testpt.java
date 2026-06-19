package test1;

import GK.PTB2;

import java.util.Random;

public class testpt {
    public static void main(String[] args){
        Random rd = new Random();
        int n = 3;
        ptb2[] arr = new ptb2[n];

        for(int i = 0 ; i < n ;i++){
            double a, b ,c;

            // sinh a ngau nhien sao cho a khac 0
            do{
                a = rd.nextInt(11) - 5;
            } while (a == 0);

            b = rd.nextInt(11) - 5;
            c = rd.nextInt(11) - 5;

            arr[i] = new ptb2(a, b, c);
        }
        // in ra phuong trinh va nghiem
        for (int i = 0; i < n; i++) {
            System.out.println("Phuong trinh " + (i + 1) + ": " + arr[i].toString());
            System.out.println("Nghiem: " + arr[i].giaiphap());
            System.out.println("------------------------");
        }
    }
}
