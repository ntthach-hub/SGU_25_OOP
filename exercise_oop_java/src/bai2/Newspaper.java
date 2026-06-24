package bai2;

public class Newspaper extends Document{
    private int releaseDate;

    public Newspaper(String id, String publisher, int number, int releaseDate){
        super(id, publisher, number);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    @Override
    public String toString(){
        return "Newspaper{" +
                "releaseDate=" + releaseDate+
                ", id ='"+ id +'\''+
                ", PublisherName ='" + publisher +'\''+
                ", number='" + number +'\''+
                "}";
    }
}
