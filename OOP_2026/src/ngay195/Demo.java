package ngay195;

public class Demo {
    public static void main(String[] args) {
        // Tạo nhân viên
        Employee nv = new Employee(1, "Nguyen", "Van A", 10_000_000);
        System.out.println("Thông tin: " + nv);

        // Lương năm
        System.out.println("Lương năm: " + nv.getAnnualSalary());

        // Tăng lương 10%
        int luongMoi = nv.raiseSalary(10);
        System.out.println("Sau khi tăng 10%: lương mới = " + luongMoi);
        System.out.println("Thông tin sau tăng: " + nv);

        // Đổi lương thủ công
        nv.setSalary(15_000_000);
        System.out.println("Sau setSalary: " + nv);
    }
}

