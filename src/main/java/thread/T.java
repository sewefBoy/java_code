package thread;

public class T {

    private int count = 10;
    private Object o = new Object();

    /**
     * 三个方法等同
     */
    public void m() {
        synchronized(o) { //任何线程要想执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }

    public void n() {
        synchronized(this) { //任何线程要想执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }

    public synchronized void o() {
        //任何线程要想执行下面的代码，必须先拿到o的锁
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
    /**
     * 三个方法等同 结束
     */


    /**
     * 下面两个方法相同
     */
    public synchronized static void q(){
        System.out.println(Thread.currentThread().getName());
    }

    public  static void r(){
        synchronized(T.class) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
