package bai1;

public class Staff extends Officers {
    private String task;
    public Staff (String name, int age, String gender, String address, String job){
        super(name, age, gender, address);
        this.task = job;
    }
    public String getTask(){
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
