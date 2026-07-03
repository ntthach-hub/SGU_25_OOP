package gk;

public class Author {
    private String name;
    private String email;
    private char gender;
    private int age;

    public Author(String name, String email, char gender, int age){
        this.name   = name;
        this.email  = email;
        this.gender = gender;
        this.age    = age;
    }

    public String getName()  { return name; }
    public String getEmail() { return email; }
    public char getGender()  { return gender; }
    public int getAge()      { return age; }
    public void setAge(int age) { this.age = age; }

    public String toString(){
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + ",age=" + age + "]";
    }
}
