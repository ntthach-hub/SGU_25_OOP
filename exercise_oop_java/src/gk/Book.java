package gk;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    private int issuedYear;

    public Book(String name, Author[] authors, double price){
        this.name       = name;
        this.authors    = authors;
        this.price      = price;
        this.qty        = 0;
    }

    public Book(String name, Author[] authors, double price, int qty, int issuedYear){
        this.name       = name;
        this.authors    = authors;
        this.price      = price;
        this.qty        = qty;
        this.issuedYear = issuedYear;
    }

    public String   getName()      { return name; }
    public Author[] getAuthors()   { return authors; }
    public double   getPrice()     { return price; }
    public int      getQty()       { return qty; }
    public int      getIssuedYear(){ return issuedYear; }

    public void setPrice(double price)     { this.price = price; }
    public void setQty(int qty)            { this.qty = qty; }
    public void setIssuedYear(int issuedYear){ this.issuedYear = issuedYear; }

    public String toString(){
        String s = "Book[name=" + name + ",authors={";
        for(int i = 0; i < authors.length; i++){
            s += authors[i].toString();
            if(i < authors.length - 1) s += ",";
        }
        s += "},price=" + price + ",qty=" + qty + ",issuedYear=" + issuedYear + "]";
        return s;
    }

    public String getAuthorNames(){
        String s = "";
        for(int i = 0; i < authors.length; i++){
            s += authors[i].getName();
            if(i < authors.length - 1) s += ",";
        }
        return s;
    }
}
