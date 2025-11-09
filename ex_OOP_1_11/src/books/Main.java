package books;

public class Main {
    public static void main(String[] args) {

        Book sach1;
        Author author = new Author("thach ngoc thao", "tnt@sv.sgu.edu.vn", 'm');
        Author[] authors = new Author[] {author};

        sach1 = new Book("Calling you", authors, 34100, 500);
        System.out.println("Name : "+ sach1.getName());
        System.out.println(sach1.getAuthors());
        System.out.println("Price:" + sach1.getPrice());
        System.out.println("getQty: "+ sach1.getQty());
        System.out.println(sach1);

        System.out.println("==============================");

        sach1.setPrice(50000);
        sach1.setQty(1000);
        System.out.println(sach1);
    }

}
