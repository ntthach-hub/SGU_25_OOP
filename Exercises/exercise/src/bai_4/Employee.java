package bai_4;

public class Employee {
    int id;
    String firstName;
    String lastname;
    int salary;
    public Employee(int idd, String fn, String ln, int slr){
        id = idd;
        firstName = fn;
        lastname = ln;
        salary = slr;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary = salary + salary * percent / 100;
        return salary;
    }
    public String toString(){
        return "Employee "+ id + "name: " + firstName + lastname + "salary = " + salary ;
    }
    public static void main(String[] args){
        Employee e1 ,e2;
        e1 = new Employee(11, "Pham Hoang", "Tien", 10000);
        e2 = new Employee(12, "Nguyen Thai", "Tu", 12000);
        System.out.println("Luong cua Tien tren nam: " +e1.getAnnualSalary());
        System.out.println("Luong cua Tu tren nam: " +e2.getAnnualSalary());
        System.out.println("Luong cua Tien sau khi 10% : " +e1.raiseSalary(10));
        System.out.println("Luong cua Tu sau khi tang 10% : " +e2.raiseSalary(10));
    }

}
