package exam20202021;

public class Main {
    public static void main(String[] args){
        FullName fn = new FullName("Nguyen", "Van", "A");
        Address ar = new Address("11A","Vo Thi Sau", "3","HCM");

        Student st =new Student("31237844",fn,ar);
        st.printStudent();
    }
}
