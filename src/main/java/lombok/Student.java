package lombok;

@Data
public class Student {
    private String name;
    private String id;
}

class test{
    public static void main(String[] args) {
        Student s = new Student();
        s.getId();
    }
}