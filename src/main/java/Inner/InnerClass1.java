package Inner;

/**
 * 内部类
 */
public class InnerClass1 {
    public void show(){
        System.out.println("InnerClass1 show");
    }

    class Inner{
        public void innerShow(){
            System.out.println("Inner innerShow");
        }
    }
}
