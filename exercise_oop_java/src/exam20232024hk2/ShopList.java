package exam20232024hk2;

import java.util.Scanner;

public class ShopList {
    private Shop[] ds;
    private int n;

    public ShopList(int max){
        ds = new Shop[max];
        n = 0;
    }

    public void them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. add regular shop");
        System.out.println("2. add Food shop");
        System.out.print("Chon: ");
        int chon = sc.nextInt();

        if (chon == 1)
            ds[n] = new RegularShop();
        else
            ds[n] = new FoodShop();

        ds[n].nhapThongTin();
        n++;
    }

    public void tinhTongTienThueTheoLoai() {

        double tongRegular = 0;
        double tongFood = 0;

        for (int i = 0; i < n; i++) {

            if (ds[i] instanceof RegularShop)
                tongRegular += ds[i].tinhTienThue();

            if (ds[i] instanceof FoodShop)
                tongFood += ds[i].tinhTienThue();
        }

        System.out.println("Tong tien RegularShop = " + tongRegular);
        System.out.println("Tong tien FoodShop = " + tongFood);
    }
}
