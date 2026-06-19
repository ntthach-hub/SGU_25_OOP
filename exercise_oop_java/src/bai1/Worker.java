package bai1;

public class Worker extends Officers {
    private int level;

    public Worker(String name, int age, String gender, String address, int level){
        super(name, age, gender, address);
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String toString(){
        return "Worker{"+
                "Level= "+level+
                ", name= " + name +
                ", Age = " + age +
                ", Gender = " +gender +
                ", Address = " + gender+
                "}";
    }
}
