package Inner;

public class Test {
    public static void main(String[] args) {
        InnerClass1 innerClass1 = new InnerClass1();
        innerClass1.show();

        InnerClass1.Inner inner = new InnerClass1().new Inner();
        inner.innerShow();


        InnerClass2.Inner inner2 = new InnerClass2.Inner();
        inner2.innerShow();
    }
}
