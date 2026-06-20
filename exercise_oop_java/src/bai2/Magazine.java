package bai2;

public class Magazine extends Document{
    private int issueNumber;
    private int issueMonth;

    public Magazine(int id, String publisher, int number, int issueNumber, int issueMonth){
        super(id, publisher, number);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }
    @Override
    public String toString(){
        return "Magazine{" +
                "issueNumber = " + issueNumber +
                ", issueMonth = " + issueMonth +
                ", id ='"+ id +'\''+
                ", PublisherName ='" + publisher +'\''+
                ", number='" + number +'\''+
                "}";
    }
}
