package ngay195;

public class Employee {
    // 4 thuoc tinh
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // 1 constructor
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    // 4 Getter
    public int getId() {
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSalary() {
        return salary;
    }

    //1 setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // NGHIEP VU 1: Luong nam
    //salary * 12
    public int getAnnualSalary(){
        return salary * 12;
    }
    // NGHIEP VU 2: Tang luong theo %
    //tang luong theo % roi tra ve muc luong moi
    public int raiseSalary(int percent){
        salary = salary + (salary *percent /100);
        return salary;
    }

    // OVERRIDE toString
    public String toString() {
        return "Employee[id=" + id
                + ", name=" + firstName + " " + lastName
                + ", salary=" + salary + "]";
    }
}
