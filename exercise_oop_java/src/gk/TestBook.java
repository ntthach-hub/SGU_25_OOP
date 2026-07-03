package gk;

import java.util.Random;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhap so cuon sach n = ");
        int n = sc.nextInt();

        System.out.print("Nhap so tac gia toi da m = ");
        int m = sc.nextInt();

        Book[] books = new Book[n];

        for(int i = 0; i < n; i++){
            int soTacGia = 1 + rd.nextInt(m);
            Author[] authors = new Author[soTacGia];

            for(int j = 0; j < soTacGia; j++){
                String name  = "Author" + rd.nextInt(1000);
                String email = name.toLowerCase() + "@gmail.com";
                char gender  = rd.nextInt(2) == 0 ? 'm' : 'f';
                int age      = 25 + rd.nextInt(36); // 25 - 60
                authors[j]   = new Author(name, email, gender, age);
            }

            String tenSach = "Book" + rd.nextInt(1000);
            double price   = 50000 + rd.nextInt(200000);
            int    qty     = rd.nextInt(50);
            int issuedYear = 2000 + rd.nextInt(25); // 2000 - 2024

            books[i] = new Book(tenSach, authors, price, qty, issuedYear);
        }

        // In ra tat ca sach
        for(int i = 0; i < n; i++){
            System.out.println(books[i]);
            System.out.println("Ten cac tac gia: " + books[i].getAuthorNames());
            System.out.println("------------------------");
        }

        // Cau 7:
        System.out.print("Nhap nam can tim = ");
        int year = sc.nextInt();

        int count = 0;
        for(int i = 0; i < n; i++){
            if(books[i].getIssuedYear() == year) count++;
        }
        System.out.println("So sach xuat ban nam " + year + " la: " + count);

        System.out.println("------------------------");

        // Cau 8:
        int maxAge = -1;
        Author oldestAuthor = null;

        for(int i = 0; i < n; i++){
            Author[] authors = books[i].getAuthors();
            for(int j = 0; j < authors.length; j++){
                if(authors[j].getAge() > maxAge){
                    maxAge        = authors[j].getAge();
                    oldestAuthor  = authors[j];
                }
            }
        }

        System.out.println("Tac gia nhieu tuoi nhat: " + oldestAuthor.getName()
                + " (" + maxAge + " tuoi)");
        System.out.print("Xuat ban sach nam: ");

        for(int i = 0; i < n; i++){
            Author[] authors = books[i].getAuthors();
            for(int j = 0; j < authors.length; j++){
                if(authors[j] == oldestAuthor){
                    System.out.print(books[i].getIssuedYear() + " ");
                }
            }
        }
        System.out.println();

        sc.close();

    }
}
