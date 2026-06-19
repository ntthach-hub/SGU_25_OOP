package test1;

public class testmain {
    public static void main(String[] args){

        polyline pll = new polyline();

        pll.themdiem(1, 4);
        pll.themdiem(0, 2);
        pll.themdiem(2,5);
        pll.themdiem(2, 0);

        System.out.println("polyline " + pll);
        System.out.println("da giac co do dai :" + pll.dodai());
        System.out.println("da giac co chu vi :" + pll.chuvi());
        System.out.println("da giac co dien tich :" + pll.dientich());
    }

}
