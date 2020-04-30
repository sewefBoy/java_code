package Inner;

/**
 * 静态内部内
 */
public class InnerClass2 {
    public void show(){
        System.out.println("InnerClass1 show");
    }

    static class Inner{
        public void innerShow(){
            System.out.println("Inner innerShow");
        }
    }
}
