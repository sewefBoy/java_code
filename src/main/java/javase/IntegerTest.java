package javase;

public class IntegerTest {

    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        Integer c = new Integer(128);
        System.out.println(a==b);
        System.out.println(a==c);
    }
}
